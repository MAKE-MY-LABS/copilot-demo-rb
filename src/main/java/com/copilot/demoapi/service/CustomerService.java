package com.copilot.demoapi.service;

import com.copilot.demoapi.model.Customer;
import com.copilot.demoapi.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    //Define a service method to get all customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    //Define a service method to get a customer by id
    public Customer getCustomerById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    //Define a service method to create a customer
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    //Define a service method to update a customer
    public Customer updateCustomer(Integer id, Customer customer) {
        Customer existingCustomer = customerRepository.findById(id).orElse(null);
        existingCustomer.setName(customer.getName());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setPhone(customer.getPhone());
        existingCustomer.setId(id);
        return customerRepository.save(customer);
    }

    //Define a service method to delete a customer by id
    public void deleteCustomerById(Integer id) {
        customerRepository.deleteById(id);
    }

    //Define a service method to delete all customers
    public void deleteAllCustomers() {
        customerRepository.deleteAll();
    }

}
