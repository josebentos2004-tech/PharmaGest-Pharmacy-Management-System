package ao.pharmagest.controller;

import ao.pharmagest.dto.CreateBatchRequest;
import ao.pharmagest.dto.CreateMedicineRequest;
import ao.pharmagest.model.Medicine;
import ao.pharmagest.model.MedicineBatch;
import ao.pharmagest.service.MedicineService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/medicines")
public class MedicineController {
    private final MedicineService service;
    public MedicineController(MedicineService service) { this.service = service; }
    @GetMapping public List<Medicine> all() { return service.findAll(); }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Medicine create(@Valid @RequestBody CreateMedicineRequest request) { return service.create(request); }
    @GetMapping("/{id}/batches") public List<MedicineBatch> batches(@PathVariable Long id) { return service.batchesFor(id); }
    @PostMapping("/{id}/batches") @ResponseStatus(HttpStatus.CREATED) public MedicineBatch addBatch(@PathVariable Long id, @Valid @RequestBody CreateBatchRequest request) { return service.addBatch(id, request); }
    @GetMapping("/{id}/stock") public Map<String, Integer> stock(@PathVariable Long id) { return Map.of("medicineId", id.intValue(), "availableQuantity", service.availableStock(id)); }
}
