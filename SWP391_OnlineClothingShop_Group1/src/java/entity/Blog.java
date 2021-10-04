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
    private String content;
    private String imageLink;  
    public Blog() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
    public Blog(int ID, String Author, String title, String content, String imageLink) {
        this.ID = ID;
        this.Author = Author;
        this.title = title;
        this.content = content;
        this.imageLink = imageLink;
    }

    
    @Override
    public String toString() {
        return "Blog{" + "ID=" + ID +",Author="+Author + ",title"+ title+",content: "+ content+ ",imagelink= "+imageLink+ '}' ;
    }
    
    
}
