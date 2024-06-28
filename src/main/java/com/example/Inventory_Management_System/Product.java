package com.example.Inventory_Management_System;

public class Product {
    private int productID;
    private String productName;
    private double productPrice;
    private int productQuantity;
    private int supplierID;
    private int warehouseID;
    private int orderId;
    public Product(int productID, String productName, double productPrice, int productQuantity, int supplierID, int warehouseID
    , int orderId) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.supplierID = supplierID;
        this.warehouseID = warehouseID;
        this.orderId = orderId;
         }
         public int getProductID(){
        return productID;
         }
         public String getProductName(){
        return productName;
         }
         public double getProductPrice(){
        return productPrice;
         }
         public int getProductQuantity(){
        return productQuantity;
         }
         public int getSupplierID(){
        return supplierID;
         }
         public int getWarehouseID(){
        return warehouseID;
         }
         public int getOrderId(){
        return orderId;
         }
         public void setProductID(int productID){
        this.productID = productID;
         }
         public void setProductName(String productName){
        this.productName = productName;
         }
         public void setProductPrice(double productPrice){
        this.productPrice = productPrice;
         }
         public void setProductQuantity(int productQuantity){
        this.productQuantity = productQuantity;
         }
         public void setSupplierID(int supplierID){
        this.supplierID = supplierID;
         }
         public void setWarehouseID(int warehouseID){
        this.warehouseID = warehouseID;
         }
         public void setOrderId(int orderId){
        this.orderId = orderId;
         }

    }
