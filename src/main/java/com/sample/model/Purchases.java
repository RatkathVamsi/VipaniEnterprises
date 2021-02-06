package com.sample.model;

import java.sql.Date;

public class Purchases {
    private String departmentName;
    private String date;
    private float amount;
    private String itemName;
    private float qty;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "purchases{" +
                "departmentName='" + departmentName + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                ", itemName='" + itemName + '\'' +
                ", qty=" + qty +
                '}';
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getQty() {
        return qty;
    }

    public void setQty(float qty) {
        this.qty = qty;
    }
}
