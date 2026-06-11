package com.example.awsbatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AwsBatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AwsBatchApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Batch Job Started");

        for(int i = 1; i <= 10; i++) {
            System.out.println("Processing Record " + i);
            Thread.sleep(1000);
        }

        System.out.println("Batch Job Completed");
    }
}