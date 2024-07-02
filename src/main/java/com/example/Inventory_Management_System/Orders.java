package com.example.Inventory_Management_System;

public class Orders {
    private int order_id;
    private int customer_id;
    private String order_date;
    private String delivery_date;
    private int total_amount;
    public Orders(int order_id, int customer_id, String order_date, String delivery_date, int total_amount) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.order_date = order_date;
        this.delivery_date = delivery_date;
        this.total_amount = total_amount;
    }
    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    public String getOrder_date() {
        return order_date;
    }
    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }
    public String getDelivery_date() {
        return delivery_date;
    }
    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }
}
