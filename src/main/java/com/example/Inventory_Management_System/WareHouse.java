package com.example.Inventory_Management_System;

public class WareHouse {
    private int warehouseID;
    private String location;
    private String StockName;
    private int StockQuantity;
    private int productId;
    public WareHouse(int warehouseID, String location, String StockName, int stockQuantity, int productId) {
        this.warehouseID = warehouseID;
        this.location = location;
        this.StockName = StockName;
        this.StockQuantity = stockQuantity;
        this.productId = productId;
    }
    public int getWarehouseID() {
        return warehouseID;
    }
    public void setWarehouseID(int warehouseID) {
        this.warehouseID = warehouseID;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getStockName() {
        return StockName;
    }
    public void setStockName(String stockName) {
        StockName = stockName;
    }
    public int getStockQuantity() {
        return StockQuantity;
    }
    public void setStockQuantity(int stockQuantity) {
        this.StockQuantity = stockQuantity;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
}
