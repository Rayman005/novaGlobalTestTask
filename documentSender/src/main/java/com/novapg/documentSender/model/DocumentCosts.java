package com.novapg.documentSender.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DocumentCosts {
    @Positive(message = "Cost must be positive")
    @JsonProperty("cost_first")
    private Double costFirst;

    @Positive(message = "Cost must be positive")
    @JsonProperty("cost_second")
    private Double costSecond;

    @Positive(message = "Cost must be positive")
    @JsonProperty("cost_third")
    private Double costThird;
}