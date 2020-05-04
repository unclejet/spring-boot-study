package com.uj.study.resthateoas.application.service;

import com.uj.study.resthateoas.infrustructure.persistence.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrdersForCustomer(String customerId);

    Order getOrderByIdForCustomer(String customerId, String orderId);

}
