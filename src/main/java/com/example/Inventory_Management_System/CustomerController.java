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
    public String registerNewCustomer(@RequestParam String CustomerUserName,@RequestParam String CustomerAddress,
                                      @RequestParam String PhoneNumber,@RequestParam String Password) {
    Customer cust=new Customer(0,CustomerUserName,CustomerAddress,PhoneNumber,Password);
     customerService.getNewCustomer(cust);
     return "redirect:/Login";
 }
 @PostMapping("/Login")
    public  String Validate(@RequestParam String CustomerUserName,@RequestParam String Password){
    List<Customer> res;
   res= customerService.Validate(CustomerUserName,Password);
//   if(res.size()==0){
//       return "redirect:/popup";
//   }
//   else {
//       return "redirect:/Home";
//   }
     return "/popup";
 }
}
