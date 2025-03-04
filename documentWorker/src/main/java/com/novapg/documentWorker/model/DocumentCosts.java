package com.novapg.documentWorker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DocumentCosts {
    @Positive(message = "Cost must be positive")
    @JsonProperty("cost_first")
    @NotNull
    private Double costFirst;

    @Positive(message = "Cost must be positive")
    @JsonProperty("cost_second")
    @NotNull
    private Double costSecond;

    @Positive(message = "Cost must be positive")
    @JsonProperty("cost_third")
    @NotNull
    private Double costThird;
}
