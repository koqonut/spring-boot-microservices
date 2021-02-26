package com.kn.customerservice.controller;

import com.kn.customerservice.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {

    private List<Customer> customers = Arrays.asList(
            new Customer(1, "Tom Brady"),
            new Customer(2, "Andrew Luck"));

    @GetMapping
    public List<Customer> getAllCustomers() {
        log.info("Requesting all customers");
        return customers;
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        log.info("Requesting customer {}",id);
        return customers.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

}
