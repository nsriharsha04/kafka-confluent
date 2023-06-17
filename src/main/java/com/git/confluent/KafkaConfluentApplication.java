package com.git.confluent;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.git.Employee;

@SpringBootApplication
public class KafkaConfluentApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(KafkaConfluentApplication.class, args);
		
//		KafkaProducer producer = context.getBean(KafkaProducer.class);
//
//        // Create an Employee object
//		Employee.Builder empBuilder = Employee.newBuilder();
//        empBuilder.setFirstName("Tony");
//        empBuilder.setLastName("Stark");
//        empBuilder.setAge(25);
//        empBuilder.setSalary(1000);
//        empBuilder.setIsProject(false);
//        Employee emp = empBuilder.build();
//        
//        
//        // Produce the Employee message to the Kafka topic
//        producer.sendMessage(emp);
	}

}
