package com.example.Catalog.model;

import com.example.Catalog.enums.GenreEnum;

public class Book {

    //Attribute
  String title;
  String author;
  String isbn;
  int pages;
  GenreEnum genre;
  String description;

  //Constructor
  public Book(String title, String author, String isbn, int pages, GenreEnum genre, String description) {
      this.title = title;
      this.author = author;
      this.isbn = isbn;
      this.pages = pages;
      this.genre = genre;
      this.description = description;
  }

  //Getter&Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public GenreEnum getGenre() {
        return genre;
    }

    public void setGenre(GenreEnum genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
