package ao.pharmagest.dto;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
public record CreateMedicineRequest(@NotBlank String name, String category, @NotNull @PositiveOrZero BigDecimal salePrice) { }
