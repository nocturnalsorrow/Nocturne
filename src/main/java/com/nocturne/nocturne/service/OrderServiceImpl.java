package com.nocturne.nocturne.service;

import com.nocturne.nocturne.model.Instrument;
import com.nocturne.nocturne.model.Order;
import com.nocturne.nocturne.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        Optional<Order> optionalManufacturer = orderRepository.findById(id);
        if(optionalManufacturer.isEmpty())
            throw new IllegalStateException("Order with id " + id + " does`t exist");
        return optionalManufacturer.get();
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrderById(Long id) {
        orderRepository.deleteById(id);
    }
}
