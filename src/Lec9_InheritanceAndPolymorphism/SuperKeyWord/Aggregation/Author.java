/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec9_InheritanceAndPolymorphism.SuperKeyWord.Aggregation;

/**
 *
 * @author Hoang
 */
public class Author {

    private String authorID;
    private String name;

    public Author(String authorID, String name) {
        this.authorID = authorID;
        this.name = name;
    }

    public Author() {
    }
    public String getAuthorID(){
        return authorID;
    }
    public void setAuthorID(String authorID){
        this.authorID = authorID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Author{" +
                "authorID='" + authorID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}