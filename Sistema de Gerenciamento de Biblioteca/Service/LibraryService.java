package Service;

import Models.Book;
import Models.DigitalMedia;
import Models.LibraryItem;
import Models.Magazine;
import Utils.Console;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    public static List<LibraryItem> libraryItems = new ArrayList<>();

    public static List<LibraryItem> MemoryLibrary(){
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", Year.of(1925), "Fiction");
        Book book2 = new Book("1984", "George Orwell", Year.of(1949), "Dystopian");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", Year.of(1960), "Fiction");

        Magazine magazine1 = new Magazine("National Geographic", "Various Authors", Year.of(2021), 5);
        Magazine magazine2 = new Magazine("Time", "Various Authors", Year.of(2021), 12);
        Magazine magazine3 = new Magazine("Forbes", "Various Authors", Year.of(2021), 8);
        
        DigitalMedia digitalMedia1 = new DigitalMedia("C++ Prime Plus", "Stephen Prata", Year.of(2011), "PDF");
        DigitalMedia digitalMedia2 = new DigitalMedia("The Beatles - Abbey Road", "The Beatles", Year.of(1969), "Music Album");
        DigitalMedia digitalMedia3 = new DigitalMedia("C# 13 and .NET 9 Modern Cross-Platform Development Fundamentals", "Mark J. Price", Year.of(2021), "eBook");
        
        libraryItems.add(book1);
        libraryItems.add(book2);
        libraryItems.add(book3);
        libraryItems.add(magazine1);
        libraryItems.add(magazine2);
        libraryItems.add(magazine3);
        libraryItems.add(digitalMedia1);
        libraryItems.add(digitalMedia2);
        libraryItems.add(digitalMedia3);
        return libraryItems;
    }  

    public static void viewItems(){
        for (LibraryItem item : libraryItems) {

            if (item instanceof  Book){
                Book book = (Book) item;
                System.out.println(book);
            } else if (item instanceof Magazine) {
                Magazine magazine = (Magazine) item;
                System.out.println(magazine);
            }
        }
    }

    public static void selectToBorrowItem(){
        System.out.println("Select the item number to borrow:");
        for (int i = 0; i < libraryItems.size(); i++) {

            LibraryItem item = libraryItems.get(i);

            if (item instanceof  Book){
                Book book = (Book) item;
                System.out.println("id: " + (i + 1) + ". " + book);

            } else if (item instanceof Magazine) {
                Magazine magazine = (Magazine) item;
                System.out.println("id: " +(i + 1) + ". " + magazine);
            }
        }
        int choice = Console.readInt("Enter the item number: ") - 1;
        if (choice >= 0 && choice < libraryItems.size()) {
            LibraryItem selectedItem = libraryItems.get(choice);
            selectedItem.borrowItem();
        } else {
            System.out.println("Invalid item number.");
        }
    }

    public static void selectToReturnItem(){
        System.out.println("Select the item number to return:");
        int qtd = 0;
        for (int i = 0; i < libraryItems.size(); i++) {

            LibraryItem item = libraryItems.get(i);

            if (item instanceof  Book && item.getIsBorrowed()){
                Book book = (Book) item;
                System.out.println("id: " + (i + 1) + ". " + book);

            } else if (item instanceof Magazine && item.getIsBorrowed()) {
                Magazine magazine = (Magazine) item;
                System.out.println("id: " +(i + 1) + ". " + magazine);
            }
            if (item.getIsBorrowed()) qtd++;
        }
        if (qtd == 0){
            System.out.println("No items are currently borrowed.");
            return;
        }
        int choice = Console.readInt("Enter the item number: ") - 1;
        if (choice >= 0 && choice < libraryItems.size()) {
            LibraryItem selectedItem = libraryItems.get(choice);
                selectedItem.returnItem();
        } else {
            System.out.println("Invalid item number.");
        }
    }

    public static void readExampleIsNotBorrowed(){
        int qtd = 0;
        for (int i = 0; i < libraryItems.size(); i++) {

            LibraryItem item = libraryItems.get(i);

            if (item instanceof  Book book){
                System.out.println("id: " + (i + 1) + ". " + book);

            }
        }
        if (qtd == 0){
            System.out.println("No books available to read a sample.");
            return;
        }
        int choice = Console.readInt("Enter the item number: ") - 1;
        if (choice >= 0 && choice < libraryItems.size()) {
            LibraryItem selectedItem = libraryItems.get(choice);
            if (selectedItem instanceof Book book) {
                System.out.println(book.readSample());
            } else {
                System.out.println("Selected item is not a book.");
            }
        } else {
            System.out.println("Invalid item number.");
        }
    }

    public static void flipPagesIsNotBorrowed(){
        int qtd = 0;
        for (int i = 0; i < libraryItems.size(); i++) {

            LibraryItem item = libraryItems.get(i);

            if (item instanceof  Magazine magazine){
                System.out.println("id: " + (i + 1) + ". " + magazine);
                qtd++;
            }
        }
        if (qtd == 0){
            System.out.println("No magazines available to flip through.");
            return;
        }
        int choice = Console.readInt("Enter the item number: ") - 1;
        if (choice >= 0 && choice < libraryItems.size()) {

            LibraryItem selectedItem = libraryItems.get(choice);
            if (selectedItem instanceof Magazine magazine) {
                System.out.println(magazine.flipPages());
            } else {
                System.out.println("Selected item is not a magazine.");
            }
        } else {
            System.out.println("Invalid item number.");
        }
    }

    public static void playDigitalMedia(){
        int qtd = 0;

        for (int i = 0; i < libraryItems.size(); i++) {

            LibraryItem item = libraryItems.get(i);

            if (item instanceof  DigitalMedia digitalMedia){
                System.out.println("id: " + (i + 1) + ". " + digitalMedia);
                qtd++;
            }
        }
        if (qtd == 0){
            System.out.println("No digital media available to play.");
            return;
        }
        int choice = Console.readInt("Enter the item number: ") - 1;
        if (choice >= 0 && choice < libraryItems.size()) {

            LibraryItem selectedItem = libraryItems.get(choice);
            if (selectedItem instanceof DigitalMedia digitalMedia) {
                System.out.println(digitalMedia.play());
            } else {
                System.out.println("Selected item is not a digital media.");
            }
        } else {
            System.out.println("Invalid item number.");
        }
    }
}