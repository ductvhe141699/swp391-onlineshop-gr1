/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Objects;

/**
 *
 * @author Duy Manh
 */
public class Blog {
    private int ID;
    private String author;
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
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public Blog(int ID, String author, String title, String content, String imageLink) {
        this.ID = ID;
        this.author = author;
        this.title = title;
        this.content = content;
        this.imageLink = imageLink;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Blog other = (Blog) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.content, other.content)) {
            return false;
        }
        if (!Objects.equals(this.imageLink, other.imageLink)) {
            return false;
        }
        return true;
    }
 

    
    @Override
    public String toString() {
        return "Blog{" + "ID=" + ID +",Author="+author + ",title"+ title+",content: "+ content+ ",imagelink= "+imageLink+ '}' ;
    }
    
    
}
