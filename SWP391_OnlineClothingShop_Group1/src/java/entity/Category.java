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
public class Category {
    int cateID ; 
    int cateName ; 

    public Category() {
    }

    public Category(int cateID, int cateName) {
        this.cateID = cateID;
        this.cateName = cateName;
    }

    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
    }

    public int getCateName() {
        return cateName;
    }

    public void setCateName(int cateName) {
        this.cateName = cateName;
    }
    
}
