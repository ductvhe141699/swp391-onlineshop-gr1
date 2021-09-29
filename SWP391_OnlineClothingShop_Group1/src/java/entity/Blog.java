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
public class Blog {
    private int ID;
    private String title;
    private String imageLink;

    public Blog() {
    }

    public Blog(int ID, String title, String imageLink) {
        this.ID = ID;
        this.title = title;
        this.imageLink = imageLink;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    @Override
    public String toString() {
        return "Blog{" + "ID=" + ID + ", title=" + title + ", imageLink=" + imageLink + '}';
    }
    
    
}
