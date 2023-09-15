package com.p4n;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEventHandlingApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringEventHandlingApplication.class, args);
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		//let us raise a start event.
		context.start();
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		info data = new info("sanjana",21,128);
		System.out.println("My Name is : "+data.getName());
		System.out.println("My Age is : "+data.getAge());
		System.out.println("My Height is : "+data.getHeight());
		
		data.setHeight(158);
		System.out.println(data.getHeight());
		System.out.println(data.getName());
		Map<Integer, String> loaddata=new HashMap<>();
		loaddata.put(101, "toy1");
		loaddata.put(102, "toy2");
		loaddata.put(103, "toy3");
		loaddata.put(104, "toy4");
		Map_data map_data1=new Map_data(loaddata);
		//System.out.println(map_data1.getData());
		for (Map.Entry<Integer, String>entry:map_data1.getData().entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
			
		}
		 // Let us raise a stop event.
		context.stop();
		
		
		
		
	}


}
