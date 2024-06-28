package com.example.Inventory_Management_System;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository
public class CustomerRepository {
    private final JdbcClient jdbcClient;
    public CustomerRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }
    public List<Customer> getAllCustomer() {
        return jdbcClient.sql("select * from customer").query(
                (rs,rowNum) -> new Customer(
                        rs.getInt("Customer_Id"),
                        rs.getString("Customer_UserName"),
                        rs.getString("Address"),
                        rs.getString("phone_number"),
                        rs.getString("Password")
                )).list();
    }
    public void insertCustomer(Customer customer) {
        jdbcClient.sql("INSERT INTO Customer(Customer_UserName,Address,phone_number,Password)" +
                        "values (?,?,?,?)").params(
                  customer.getCustomerName(),customer.getCustomerAddress(),customer.getPhoneNumber(),customer.getPassword()
                );
    }
}
