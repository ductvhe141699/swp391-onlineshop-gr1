/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eltity;

/**
 *
 * @author BEAN
 */
public class Feedback {
    int id ; 
    int userID; 
    int productID ; 
    int orderID ;
    int star ;
    String feedbackDetail  ;

    public Feedback() {
    }

    public Feedback(int id, int userID, int productID, int orderID, int star, String feedbackDetail) {
        this.id = id;
        this.userID = userID;
        this.productID = productID;
        this.orderID = orderID;
        this.star = star;
        this.feedbackDetail = feedbackDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getFeedbackDetail() {
        return feedbackDetail;
    }

    public void setFeedbackDetail(String feedbackDetail) {
        this.feedbackDetail = feedbackDetail;
    }
     
}