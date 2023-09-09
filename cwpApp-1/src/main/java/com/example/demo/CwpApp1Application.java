package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CwpApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(CwpApp1Application.class, args);
		// Create an application context using annotation-based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the HelloWorld bean from the context
        Welcome helloWorld = context.getBean(Welcome.class);


        // Call the printMessage method to print "Hello, World!"
        helloWorld.printMessage();
		
	}

}
