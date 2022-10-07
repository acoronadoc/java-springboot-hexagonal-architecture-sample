package com.lostsys.sample.hexagonal.infra.inputadapter.http;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lostsys.sample.hexagonal.domain.Orders;
import com.lostsys.sample.hexagonal.infra.inputport.OrderInputPort;

@RestController
@RequestMapping(value = "order")
public class OrderAPI {
    
    @Autowired
    OrderInputPort orderInputPort;

    @PostMapping(value = "create", produces=MediaType.APPLICATION_JSON_VALUE)
    public Orders create( @RequestParam String customerId, @RequestParam BigDecimal total ) {
        return orderInputPort.createOrder(customerId, total);
        }
    
}
