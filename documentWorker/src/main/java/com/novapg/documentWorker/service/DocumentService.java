package com.novapg.documentWorker.service;

import com.novapg.documentWorker.model.DocumentCosts;
import com.novapg.documentWorker.model.DocumentRequest;
import com.novapg.documentWorker.model.DocumentResponse;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class DocumentService {
    private static final Logger logger = LoggerFactory.getLogger(DocumentService.class);

    public DocumentResponse processDocument(DocumentRequest request) {
        DocumentCosts costs = request.getCosts();
        double sum = costs.getCostFirst() + costs.getCostSecond() + costs.getCostThird();
        DocumentResponse response = new DocumentResponse(sum, request.getDescription());
        logger.info("Processed Document: {}", response);
        return response;
    }
}
