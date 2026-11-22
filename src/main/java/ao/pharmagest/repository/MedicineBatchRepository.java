package ao.pharmagest.repository;
import ao.pharmagest.model.MedicineBatch;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;
public interface MedicineBatchRepository extends JpaRepository<MedicineBatch, Long> {
    List<MedicineBatch> findByMedicineIdAndExpiryDateAfterAndQuantityGreaterThanOrderByExpiryDateAsc(Long medicineId, LocalDate date, Integer quantity);
    List<MedicineBatch> findByMedicineId(Long medicineId);
}
