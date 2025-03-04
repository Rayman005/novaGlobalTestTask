package com.novapg.documentSender.service;

import com.novapg.documentSender.client.ServiceClient;
import com.novapg.documentSender.model.DocumentCosts;
import com.novapg.documentSender.model.DocumentRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.Random;

@Service
public class DocumentService {
    private final ServiceClient serviceClient;

    public DocumentService(ServiceClient serviceClient) {
        this.serviceClient = serviceClient;
    }

    public void sendDocumentRequest() {
        DocumentRequest request = generateRandomRequest();
        serviceClient.sendRequestToServiceClient(request);
    }

    private DocumentRequest generateRandomRequest() {
        Random random = new Random();
        DocumentCosts costs = new DocumentCosts(
                Math.abs(random.nextDouble() * 10),
                Math.abs(random.nextDouble() * 10),
                Math.abs(random.nextDouble() * 10)
        );
        return new DocumentRequest(
                costs,
                "Random " + UUID.randomUUID()
        );
    }
}
