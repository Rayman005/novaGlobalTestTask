package com.novapg.documentWorker.controller;

import com.novapg.documentWorker.model.DocumentRequest;
import com.novapg.documentWorker.model.DocumentResponse;
import com.novapg.documentWorker.service.DocumentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/document")
public class DocumentController {
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping("/save")
    public ResponseEntity<DocumentResponse> saveDocument(@Valid @RequestBody DocumentRequest request) {
        DocumentResponse response = documentService.processDocument(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
