package com.lostsys.sample.hexagonal.application;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lostsys.sample.hexagonal.domain.Orders;
import com.lostsys.sample.hexagonal.infra.inputport.OrderInputPort;
import com.lostsys.sample.hexagonal.infra.outputport.EntityRepository;

@Component
public class OrderUserCase implements OrderInputPort {

    @Autowired
    EntityRepository entityRepository;

    @Override
    public Orders createOrder(String customerId, BigDecimal total) {
        Orders order = Orders.builder()
            .id( UUID.randomUUID().toString() )
            .customerId( customerId )
            .total( total )
            .build();

        return entityRepository.save( order );
    }
    
}
