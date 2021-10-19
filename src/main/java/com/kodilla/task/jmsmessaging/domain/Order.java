package com.kodilla.task.jmsmessaging.domain;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class Order {

    private List<String> productsIds;

    private String userId;

    private BigDecimal orderValue;



}
