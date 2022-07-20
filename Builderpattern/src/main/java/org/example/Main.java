package org.example;

public class Main {
    public static void main(String[] args) {
        Book.Builder builder= new Book.Builder("12erTYJ");
        Book book =builder.Name("Harry Potter").author("J.K.Rawling").numberOfPages(300).build();
        System.out.println(book);

    }
}