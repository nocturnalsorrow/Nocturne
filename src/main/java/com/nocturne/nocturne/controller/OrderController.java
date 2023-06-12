package com.nocturne.nocturne.controller;



import com.nocturne.nocturne.model.Order;
import com.nocturne.nocturne.model.User;
import com.nocturne.nocturne.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/getbyid/{id}")
    public Order getOrderById(@PathVariable("id")Long id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("/create")
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @DeleteMapping("/deletebyid/{id}")
    public void deleteOrderById(@PathVariable("id")Long id) {
        orderService.deleteOrderById(id);
    }
}
