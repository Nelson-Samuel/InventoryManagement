package com.example.Inventory_Management_System;

public class Customer {
    private int CustomerId;
    private  String CustomerUserName;
    private String CustomerAddress;
    private String PhoneNumber;
    private String Password;
    public Customer(int CustomerId, String CustomerUserName, String CustomerAddress, String PhoneNumber, String Password) {
        this.CustomerId = CustomerId;
        this.CustomerUserName = CustomerUserName;
        this.CustomerAddress = CustomerAddress;
        this.PhoneNumber = PhoneNumber;
        this.Password = Password;
    }
    public int getCustomerId() {
        return CustomerId;
    }
    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }
    public String getCustomerName() {
        return CustomerUserName;
    }
    public void setCustomerName(String CustomerName) {
        this.CustomerUserName = CustomerName;
    }
    public String getCustomerAddress() {
        return CustomerAddress;
    }
    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
}
