package com.example.awsbatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsBatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AwsBatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Batch Job Started");

        for(int i=1;i<=10;i++) {
            System.out.println("Processing Record " + i);
            Thread.sleep(1000);
        }

        System.out.println("Batch Job Completed");

        System.exit(0);
    }
}
