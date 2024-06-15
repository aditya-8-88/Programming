package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Alien;
import com.example.demo.repo.AlienRepo;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
		
		Alien alien = context.getBean(Alien.class);
		alien.setId(17);
		alien.setName("Aditya");
		alien.setTech("Java Stack");
		
		AlienRepo alienRepo = context.getBean(AlienRepo.class);
		alienRepo.save(alien);
		
		System.out.println(alienRepo.fetch());
		
	}

}
