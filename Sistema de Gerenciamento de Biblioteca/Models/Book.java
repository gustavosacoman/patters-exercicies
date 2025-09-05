package Models;

import java.time.Year;

public class Book extends LibraryItem {
    protected String genre;

    public Book(String title, String author, Year publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    public String readSample() {
        if(!isBorrowed) {
            return "Reading a sample of the book: " + title;
        } else {
            return "This book is currently borrowed. Please return it to read an available sample.";
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", genre='" + genre + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
    
}
