package com.example.mitacdemotaskhelloworld;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.util.Arrays;

@SpringBootApplication
@EnableTask
@Slf4j
public class MitacDemoTaskHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(MitacDemoTaskHelloWorldApplication.class, args);
	}



}
