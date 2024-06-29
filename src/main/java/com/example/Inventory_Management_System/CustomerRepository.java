package com.example.Inventory_Management_System;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

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
        String sql="INSERT INTO Customer(Customer_UserName,Address,phone_number,Password)values (?,?,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcClient.sql(sql).params(
                  customer.getCustomerName(),customer.getCustomerAddress(),customer.getPhoneNumber(),customer.getPassword()
                ) .update(keyHolder);
        Number key = keyHolder.getKey();
        if (key != null) {
            customer.setCustomerId(key.intValue());
        };
    }
    public List<Customer> CustomerValidate(String UserName, String Password1) {
        return jdbcClient.sql("SELECT * from Customer where " +
                "Customer_UserName =:UserName and Password= :Password1").params(Map.of("UserName",UserName,"Password1",
                Password1)).query((rs,rowNum) -> new Customer(
                rs.getInt("Customer_Id"),
                rs.getString("Customer_UserName"),
                rs.getString("Address"),
                rs.getString("phone_number"),
                rs.getString("Password")
        )).list();
    }
}
