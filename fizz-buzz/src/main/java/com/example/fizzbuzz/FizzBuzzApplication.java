package com.example.fizzbuzz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FizzBuzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(){
		return args -> {
			for (int i=1; i<101; i++){
				String result = "";
				result += (i % 3) == 0 ? "Fizz" : "";
				result += (i % 5) == 0 ? "Buzz" : "";
				System.out.println(!result.isEmpty() ? result : i);
			}
		};
	}

	// solution 2
	@Bean
	public CommandLineRunner runner(){
		return args -> {
			for (int i=1; i<101; i++){
				if ((i % 3 == 0) && (i % 5 == 0)) {
					System.out.println("FizzBuzz");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				} else if (i % 3 == 0){
					System.out.println("Fizz");
				} else {
					System.out.println(i);
				}
			}
		};
	}

}
