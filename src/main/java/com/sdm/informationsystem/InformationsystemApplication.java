package com.sdm.informationsystem;

import com.sdm.informationsystem.model.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class InformationsystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(InformationsystemApplication.class, args);
		// Assuming you have established a database connection and obtained a reference to the EntityManager or EntityManagerFactory
	}
}
