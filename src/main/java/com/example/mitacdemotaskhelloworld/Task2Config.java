package com.example.mitacdemotaskhelloworld;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Slf4j
@Configuration
@Profile("Task2")
public class Task2Config {

    @Bean
    public CommandLineRunner commandLineRunner(){
        return args -> {
//            File f = new File("/minikube");
//            Arrays.stream(f.list()).forEach(s -> log.info("file {}", s));
            log.info("Hello World! Task2");
        };
    }
}
