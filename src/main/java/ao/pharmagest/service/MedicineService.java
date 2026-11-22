package ao.pharmagest.service;

import ao.pharmagest.dto.CreateBatchRequest;
import ao.pharmagest.dto.CreateMedicineRequest;
import ao.pharmagest.model.Medicine;
import ao.pharmagest.model.MedicineBatch;
import ao.pharmagest.repository.MedicineBatchRepository;
import ao.pharmagest.repository.MedicineRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
public class MedicineService {
    private final MedicineRepository medicines;
    private final MedicineBatchRepository batches;
    public MedicineService(MedicineRepository medicines, MedicineBatchRepository batches) { this.medicines = medicines; this.batches = batches; }

    public List<Medicine> findAll() { return medicines.findAll(); }
    public Medicine findById(Long id) { return medicines.findById(id).orElseThrow(() -> new IllegalArgumentException("Medicamento não encontrado.")); }
    public Medicine create(CreateMedicineRequest request) { return medicines.save(new Medicine(request.name(), request.category(), request.salePrice())); }
    @Transactional public MedicineBatch addBatch(Long medicineId, CreateBatchRequest request) {
        Medicine medicine = findById(medicineId);
        return batches.save(new MedicineBatch(medicine, request.batchCode(), request.expiryDate(), request.quantity()));
    }
    public List<MedicineBatch> batchesFor(Long medicineId) { findById(medicineId); return batches.findByMedicineId(medicineId); }
    public int availableStock(Long medicineId) {
        return batches.findByMedicineId(medicineId).stream().filter(b -> b.getExpiryDate().isAfter(LocalDate.now())).mapToInt(MedicineBatch::getQuantity).sum();
    }
}
