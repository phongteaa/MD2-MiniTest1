package com.company;

public class ProgrammingBook extends Book {
    private String language, framework;

    public ProgrammingBook(int bookCode, String name, String author, double price, String language, String framework) {
        super(bookCode, name, author, price);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" + super.toString() +
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                '}';
    }
}
