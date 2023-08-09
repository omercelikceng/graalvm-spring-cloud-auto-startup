package org.example.graalvm.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GraalVMInitializationApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraalVMInitializationApplication.class, args);
    }
}
