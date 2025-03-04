package com.novapg.documentSender.client;

import com.novapg.documentSender.model.DocumentRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServiceClient {
    @Value("${serviceClient.url}")
    private String serviceClientUrl;
    private final RestTemplate restTemplate;
    private static final Logger logger = LoggerFactory.getLogger(ServiceClient.class);

    public ServiceClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void sendRequestToServiceClient(DocumentRequest request) {
        try {
            restTemplate.postForEntity(serviceClientUrl, request, String.class);
            logger.info("Request sent to ServiceClient: {}", request);
        } catch (Exception e) {
            logger.error("Error sending request to ServiceClient", e);
        }
    }
}
