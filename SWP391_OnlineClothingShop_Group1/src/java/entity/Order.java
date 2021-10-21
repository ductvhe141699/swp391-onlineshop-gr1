/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author BEAN
 */
public class Order extends OrderDetail {

    int id;
    int userId;
    int totalPrice;
    String note;
    String status;
    String date;

    public Order() {
    }

    public Order(int userId, int totalPrice, String note) {
        this.userId = userId;
        this.totalPrice = totalPrice;
        this.note = note;
    }
    
    public Order(int id, int userId, int totalPrice, String note, String status, String date) {
        this.id = id;
        this.userId = userId;
        this.totalPrice = totalPrice;
        this.note = note;
        this.status = status;
        this.date = date;
    }

    public Order(int id, int userId, int totalPrice, String note, String status, String date, int orderID, int productID, String productName, int productPrice, int quantity) {
        super(orderID, productID, productName, productPrice, quantity);
        this.id = id;
        this.userId = userId;
        this.totalPrice = totalPrice;
        this.note = note;
        this.status = status;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
