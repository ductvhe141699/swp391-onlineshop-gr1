/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Duy Manh
 */
public class Cart {
    private int UserID;
    private int ProductID;
    private int Amount;

    public Cart() {
    }

    public Cart(int UserID, int ProductID, int Amount) {
        this.UserID = UserID;
        this.ProductID = ProductID;
        this.Amount = Amount;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    @Override
    public String toString() {
        return "Cart{" + "UserID=" + UserID + ", ProductID=" + ProductID + ", Amount=" + Amount + '}';
    }
    
    
}
