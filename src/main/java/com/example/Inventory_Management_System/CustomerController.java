package com.example.Inventory_Management_System;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/")
public class CustomerController {
private final CustomerService customerService;
public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
}
@GetMapping("/Home")
    public String getAllCustomers(Model model) {
    List<Customer> data=customerService.getAllCustomers();
    model.addAttribute("data", data);
    return "Home";
}
@PostMapping("/")
    public String addCustomer() {
    return "123";
}
@GetMapping("/Login")
    public String login() {
    return "index";
 }
 @GetMapping("/Register")
    public String Register(){
    return "register";
 }
 @PostMapping("/Register")
    public String registerNewCustomer(@ModelAttribute("newUser") Customer customer) {
     customerService.getNewCustomer(customer);
     return "redirect:/Login";
 }
}
