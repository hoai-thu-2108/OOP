/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.globalict.aims.media;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author H2
 */
public class book {
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

    public book (){}
    public book(String title, String category, float cost){
    this.title = title;
    this.category= category;
    this.cost= cost;
        
}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    

public void addAuthor(String author){
this.authors.add (author);
}
public void addAuthors(List<String> authors){
this.authors.addAll(authors);
}
public List<String> getAuthors(){
return this.authors;
}
 public void removeAuthor(String authorName){
        if(authors.contains(authorName)==true)
            authors.remove(authorName);
}  
}
