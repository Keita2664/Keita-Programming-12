package com.example.librarydatabaseassignment;

public class BookInformation {
    public String title;
    public String author;
    public String genre;
    public int quantity;
    public int bookID;

    BookInformation(String title, String author, String genre, int quantity, int bookID){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.quantity = quantity;
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getBookID() {
        return bookID;
    }
    public void borrowed(){
        if (quantity > 0){
            quantity--;
        }

    }
    public String toString(){
        return title;
    }
}
