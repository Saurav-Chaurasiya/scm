package com.scm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScmApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScmApplication.class, args);


	}
	public CommandLineRunner commandLineRunner(String args[]){
		return runner->{
			System.out.println("Hello World");
		};
	}

}
 