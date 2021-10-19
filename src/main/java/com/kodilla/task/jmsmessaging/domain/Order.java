package com.kodilla.task.jmsmessaging.domain;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {

    private List<String> productsIds;

    private String userId;

    private BigDecimal orderValue;



}
