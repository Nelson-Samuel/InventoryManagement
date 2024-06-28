package com.example.Inventory_Management_System;

public class Supplier {
    private int supplierID;
    private String supplierUserName;
    private String phoneNumber;
    private String password;
    public Supplier(int supplierID, String supplierUserName, String phoneNumber, String password) {
        this.supplierID = supplierID;
        this.supplierUserName = supplierUserName;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
    public int getSupplierID() {
        return supplierID;
    }
    public String getSupplierName() {
        return supplierUserName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }
    public void setSupplierName(String supplierName) {
        this.supplierUserName = supplierName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
