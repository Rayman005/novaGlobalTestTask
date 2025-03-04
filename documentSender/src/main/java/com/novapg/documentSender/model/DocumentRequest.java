package com.novapg.documentSender.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DocumentRequest {
    @NotNull(message = "Costs must not be null")
    private DocumentCosts costs;
    @NotNull(message = "Costs must not be null")
    private String description;
}