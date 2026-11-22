package ao.pharmagest.dto;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
public record CreateBatchRequest(@NotBlank String batchCode, @NotNull @Future LocalDate expiryDate, @NotNull @PositiveOrZero Integer quantity) { }
