package Models;

import Interfaces.IBorrowable;
import java.time.Year;

public class LibraryItem implements IBorrowable {
    protected String title;
    protected String author;
    protected Year publicationYear;
    protected boolean isBorrowed;

    public LibraryItem(String title, String author, Year publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
    }

    @Override
    public void borrowItem() {
        if(this.isBorrowed){
            System.out.println("Item is already borrowed: " + this.title);
            return;
        }
        isBorrowed = true;
        System.out.println("You have borrowed: " + this.title);
    }
    @Override
    public void returnItem() {
        if(!this.isBorrowed){
            System.out.println("Item was not borrowed");
            return;
        }
        isBorrowed = false;
        System.out.println("You have returned: " + this.title);
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public String getTitle() {
        return title;
    }
}
