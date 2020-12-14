package com.report.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ReportJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportJavaApplication.class, args);
    }

}
