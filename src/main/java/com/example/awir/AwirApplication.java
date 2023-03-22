package com.example.awir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwirApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwirApplication.class, args); //znajduje funkcje run
    }

	/*
	@EventListener(ContextClosedEvent.class)
	public void finish() {
		System.out.println("Wyłączanie RMI");
		if(this == null){
			System.out.println("RMI shutdown.");
		}
		else if (this.RMI.isInitialized()) {
			this.RMI.shutdown();
			System.out.println("RMI shutdown.");
		}
	}*/

}
