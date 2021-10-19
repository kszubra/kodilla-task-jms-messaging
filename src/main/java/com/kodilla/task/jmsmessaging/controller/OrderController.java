package com.kodilla.task.jmsmessaging.controller;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodilla.task.jmsmessaging.domain.Order;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
@Slf4j
public class OrderController {
    private JmsTemplate jmsTemplate;

    @PostMapping()
    public void processOrder(@RequestBody Order order) {
        log.info("Received order: {}", order);

        jmsTemplate.convertAndSend("orders-input", order);
    }
}
