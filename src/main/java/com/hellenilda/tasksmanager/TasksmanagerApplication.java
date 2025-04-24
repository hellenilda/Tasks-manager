package com.hellenilda.tasksmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class TasksmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksmanagerApplication.class, args);
	}

}
