package com.worthen.cody.springwebapp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebappApplication.class, args);
		Set<String> numbers = new HashSet<>();
		numbers.add("14");
		numbers.add("3");
		numbers.add("1");
		System.out.println(numbers.add("1"));

		for (String s : numbers) {
			System.out.println(s);
		}
	}

}
