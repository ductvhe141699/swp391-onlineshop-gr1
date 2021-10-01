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
    private String Author;
    private String title;
    private String imageLink;
    private String content;
    public Blog() {
    }

    public Blog(int ID, String Author, String title, String imageLink, String content) {
        this.ID = ID;
        this.Author = Author;
        this.title = title;
        this.imageLink = imageLink;
        this.content = content;
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

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    @Override
    public String toString() {
        return "Blog{" + "ID=" + ID +",Author="+Author + ",title"+ title+ ",imagelink= "+imageLink+ ",content: "+ content+'}' ;
    }
    
    
}
