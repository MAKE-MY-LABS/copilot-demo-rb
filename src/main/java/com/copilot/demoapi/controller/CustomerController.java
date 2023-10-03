package com.copilot.demoapi.controller;

import com.copilot.demoapi.model.Customer;
import com.copilot.demoapi.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    //Define a controller method to get all customers which return ResponseEntity with status code and body
    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

    //Define a controller method to get a customer by id which return ResponseEntity with status code and body
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(Integer id) {
        return ResponseEntity.ok(customerService.getCustomerById(id));
    }

    //Define a controller method to create a customer which return ResponseEntity with status code and body
    @PostMapping
    public ResponseEntity<Customer> createCustomer(Customer customer) {
        return ResponseEntity.ok(customerService.createCustomer(customer));
    }

    //Define a controller method to update a customer which return ResponseEntity with status code and body
    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Integer id, Customer customer) {
        return ResponseEntity.ok(customerService.updateCustomer(id, customer));
    }

    //Define a controller method to delete a customer by id which return ResponseEntity with status code and body
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomerById(@PathVariable Integer id) {
        customerService.deleteCustomerById(id);
        return ResponseEntity.ok().build();
    }

    //Define a controller method to delete all customers which return ResponseEntity with status code and body
    @DeleteMapping
    public ResponseEntity<Void> deleteAllCustomers() {
        customerService.deleteAllCustomers();
        return ResponseEntity.ok().build();
    }
}
