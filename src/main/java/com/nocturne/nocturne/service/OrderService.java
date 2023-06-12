package com.nocturne.nocturne.service;

import com.nocturne.nocturne.model.Instrument;
import com.nocturne.nocturne.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();

    Order getOrderById(Long id);

    Order createOrder(Order order);

    void deleteOrderById(Long id);
}
