package com.tripnote;

import org.springframework.boot.SpringApplication;

public class TestTripnoteApplication {

	public static void main(String[] args) {
		SpringApplication.from(TripnoteApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
