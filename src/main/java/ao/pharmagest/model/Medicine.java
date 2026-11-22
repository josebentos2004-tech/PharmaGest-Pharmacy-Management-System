package ao.pharmagest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "medicines")
public class Medicine {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank @Column(nullable = false, length = 160)
    private String name;
    @Column(length = 100)
    private String category;
    @NotNull @PositiveOrZero @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal salePrice;
    @Column(nullable = false)
    private boolean active = true;
    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    protected Medicine() {}
    public Medicine(String name, String category, BigDecimal salePrice) {
        this.name = name; this.category = category; this.salePrice = salePrice;
    }
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public BigDecimal getSalePrice() { return salePrice; }
    public boolean isActive() { return active; }
    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setSalePrice(BigDecimal salePrice) { this.salePrice = salePrice; }
    public void setActive(boolean active) { this.active = active; }
}
