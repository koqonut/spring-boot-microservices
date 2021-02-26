package com.kn.orderservice.controller;

import com.kn.orderservice.resource.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/orders")
@Slf4j
public class OrderController {
    private final List<Order> orders = Arrays.asList(
            new Order(1, 1, "Football"),
            new Order(2, 1, "Hot dogs"),
            new Order(3, 2, "Soda"),
            new Order(4, 1, "Helmet"),
            new Order(5, 2, "Shoes"));

    @GetMapping
    public List<Order> getAllOrders() {
        log.info("Requesting all orders");
        System.out.println("retrieve");
        return orders;
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
        log.info("Requesting order {}",id);
        return orders.stream()
                .filter(order -> order.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}