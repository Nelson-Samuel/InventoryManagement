package com.example.Inventory_Management_System;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<Customer> getAllCustomers() {
        return this.customerRepository.getAllCustomer();
    }
    public void getNewCustomer(Customer customer ) {
         customerRepository.insertCustomer(customer);
    }
}
