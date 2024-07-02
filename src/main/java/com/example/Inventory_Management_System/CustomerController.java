package com.example.Inventory_Management_System;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.List;
@Controller
@RequestMapping("/")
public class CustomerController {
private final CustomerService customerService;
public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
}
    @Controller
    public static class AuthInterceptor implements HandlerInterceptor {
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            HttpSession session = request.getSession();
            String username = (String) session.getAttribute("username");
            if (username == null) {
                response.sendRedirect("/?error=Home");
                return false;
            }
            return true;
        }
    }
@GetMapping("/Home")
    public String getAllCustomers(Model model) {
    List<Customer> data=customerService.getAllCustomers();
    model.addAttribute("data", data);
    return "Home";
}
    @GetMapping("/popup")
    public String popup() {
        return "popup";
    }
    @GetMapping("/LogOut")
    public String LogOut(HttpSession session) {
    session.removeAttribute("username");
        return "Home";
    }
    @GetMapping("/Display")
    public String Display() {
        return "Display";
    }
@GetMapping("/")
    public String Home() {
    return "Home";
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
    public  String Validate(@RequestParam String CustomerUserName,@RequestParam String Password,HttpSession session){
    List<Customer> res;
   res= customerService.Validate(CustomerUserName,Password);
   if(res.size()==0){
       return "redirect:/popup";
   }
   else {
       session.setAttribute("username", CustomerUserName);
       return "redirect:/Display";
   }

 }
}
