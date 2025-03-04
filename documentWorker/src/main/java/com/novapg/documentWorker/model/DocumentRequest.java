package com.novapg.documentWorker.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DocumentRequest {
    @NotNull(message = "Costs must not be null")
    private DocumentCosts costs;

    @NotNull(message = "Description must not be null")
    @Size(min = 1, max = 255, message = "Description length must be between 1 and 255 characters")
    private String description;
}
