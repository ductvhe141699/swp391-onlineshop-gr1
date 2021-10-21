/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author BEAN
 */
public class ShipInfo {
    private int orderID;
    private String CustomerName;
    private String ShippingAddress;
    private int ShipCityID;
    private String PhoneNum;
    private String Note;

    public ShipInfo() {
    }

    public ShipInfo(int orderID, String CustomerName, String ShippingAddress, int ShipCityID, String PhoneNum, String Note) {
        this.orderID = orderID;
        this.CustomerName = CustomerName;
        this.ShippingAddress = ShippingAddress;
        this.ShipCityID = ShipCityID;
        this.PhoneNum = PhoneNum;
        this.Note = Note;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getShippingAddress() {
        return ShippingAddress;
    }

    public void setShippingAddress(String ShippingAddress) {
        this.ShippingAddress = ShippingAddress;
    }

    public int getShipCityID() {
        return ShipCityID;
    }

    public void setShipCityID(int ShipCityID) {
        this.ShipCityID = ShipCityID;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }
    
}
