package com.git.confluent;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Component;

import com.git.Employee;

@Component
public class EmployeeMessageListener implements MessageListener<String, Employee> {

    @Override
    public void onMessage(ConsumerRecord<String, Employee> record) {
        Employee employee = record.value();
        System.out.println("Received employee: " + employee);
    }
}