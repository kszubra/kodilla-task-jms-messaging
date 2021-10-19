package com.kodilla.task.jmsmessaging.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.kodilla.task.jmsmessaging.domain.Order;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OrderReceiver {

    @JmsListener(containerFactory = "jmsFactory", destination = "orders-input")
    public void receive(Order order) {
        log.info("Received and doing something with order: {}", order);
    }
}
