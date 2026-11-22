package ao.pharmagest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import java.time.LocalDate;

@Entity
@Table(name = "medicine_batches", uniqueConstraints = @UniqueConstraint(columnNames = {"medicine_id", "batch_code"}))
public class MedicineBatch {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = false, fetch = FetchType.LAZY) @JoinColumn(name = "medicine_id", nullable = false)
    private Medicine medicine;
    @NotBlank @Column(name = "batch_code", nullable = false, length = 80)
    private String batchCode;
    @NotNull @Column(nullable = false)
    private LocalDate expiryDate;
    @PositiveOrZero @Column(nullable = false)
    private Integer quantity;
    @Version private Long version;

    protected MedicineBatch() {}
    public MedicineBatch(Medicine medicine, String batchCode, LocalDate expiryDate, Integer quantity) {
        this.medicine = medicine; this.batchCode = batchCode; this.expiryDate = expiryDate; this.quantity = quantity;
    }
    public Long getId() { return id; }
    public Medicine getMedicine() { return medicine; }
    public String getBatchCode() { return batchCode; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
}
