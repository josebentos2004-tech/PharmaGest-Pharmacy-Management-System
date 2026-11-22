package ao.pharmagest.repository;
import ao.pharmagest.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MedicineRepository extends JpaRepository<Medicine, Long> { }
