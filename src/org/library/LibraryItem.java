package org.library;

public abstract class LibraryItem {
    private String author;
    private String title;
    private double price = 0.1;
    private boolean isAvailable = true;

    public LibraryItem() {

    }

    public LibraryItem(String newAuthor, String name) {
        author = newAuthor;
        this.title = name;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void reserve() {
        setAvailable(false);
    }

    public void release() {
        setAvailable(true);
    }

    public void showDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "author='" + author + '\'' +
                ", name='" + title + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
