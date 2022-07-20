package org.example;

public class Book {
    private final String Name;
    private final String ISBN;
    private final int numberOfPages;
    private final String author;

    public Book(Builder builder) {
        this.ISBN = builder.ISBN;
        this.Name=builder.Name;
        this.author=builder.author;
        this.numberOfPages= builder.numberOfPages;

    }


    static class Builder{
    private String Name;
    private String ISBN;
    private int numberOfPages;
    private String author;


public Book build(){
    return new Book(this);


}


public Builder(String ISBN){
    this.ISBN=ISBN;


}
public Builder Name(String Name){
    this.Name=Name;
    return  this;

}
    public Builder numberOfPages(int numberOfPages){
        this.numberOfPages=numberOfPages;
        return  this;

    }
    public Builder author(String author){
        this.author=author;
        return  this;

    }

}

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                '}';
    }
}

