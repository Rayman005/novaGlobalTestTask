package com.novapg.documentWorker.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DocumentResponse {
    private Double costsSum;
    private String description;
}
