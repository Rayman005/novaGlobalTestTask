package com.novapg.documentSender.controller;

import com.novapg.documentSender.service.DocumentService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/document/generate")
    public void generateRequest() {
        documentService.sendDocumentRequest();
    }

    @Scheduled(fixedRate = 60000)
    public void generateRequestScheduled() {
        documentService.sendDocumentRequest();
    }
}
