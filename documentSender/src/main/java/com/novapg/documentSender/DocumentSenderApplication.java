package com.novapg.documentSender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DocumentSenderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DocumentSenderApplication.class, args);
    }
}
