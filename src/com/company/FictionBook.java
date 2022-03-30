package com.company;

public class FictionBook extends Book {
    private String category;

    public FictionBook(int bookCode, String name, String author, double price, String category) {
        super(bookCode, name, author, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" + super.toString() +
                "category='" + category + '\'' +
                '}';
    }
}
