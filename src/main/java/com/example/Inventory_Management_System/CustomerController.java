package com.example.Inventory_Management_System;

<<<<<<< HEAD
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerInterceptor;
=======
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
>>>>>>> 6e315042e6a19c0290370aa9c6e623a6f6982a82

import java.util.List;
@Controller
@RequestMapping("/")
public class CustomerController {
private final CustomerService customerService;
public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
}
<<<<<<< HEAD
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
=======
>>>>>>> 6e315042e6a19c0290370aa9c6e623a6f6982a82
@GetMapping("/Home")
    public String getAllCustomers(Model model) {
    List<Customer> data=customerService.getAllCustomers();
    model.addAttribute("data", data);
    return "Home";
}
<<<<<<< HEAD
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
=======
@PostMapping("/")
    public String addCustomer() {
    return "123";
>>>>>>> 6e315042e6a19c0290370aa9c6e623a6f6982a82
}
@GetMapping("/Login")
    public String login() {
    return "index";
 }
 @GetMapping("/Register")
    public String Register(){
    return "register";
 }
<<<<<<< HEAD

=======
>>>>>>> 6e315042e6a19c0290370aa9c6e623a6f6982a82
 @PostMapping("/Register")
    public String registerNewCustomer(@RequestParam String CustomerUserName,@RequestParam String CustomerAddress,
                                      @RequestParam String PhoneNumber,@RequestParam String Password) {
    Customer cust=new Customer(0,CustomerUserName,CustomerAddress,PhoneNumber,Password);
     customerService.getNewCustomer(cust);
     return "redirect:/Login";
 }
<<<<<<< HEAD

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

=======
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
>>>>>>> 6e315042e6a19c0290370aa9c6e623a6f6982a82
 }
}
