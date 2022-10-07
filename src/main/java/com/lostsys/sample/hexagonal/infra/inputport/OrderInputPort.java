package com.lostsys.sample.hexagonal.infra.inputport;

import java.math.BigDecimal;

import com.lostsys.sample.hexagonal.domain.Orders;

public interface OrderInputPort {
    public Orders createOrder( String customerId, BigDecimal total );
}
