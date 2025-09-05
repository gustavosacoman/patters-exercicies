package Service;

import Models.LibraryItem;
import Utils.Console;
import java.util.List;

public class SystemLibrary {

    public static List<LibraryItem> libraryItems = LibraryService.MemoryLibrary();

    public static void StartLibrary(){
        int option = 0;
        
    do{

            System.out.println("Library Management System");
            System.out.println("1. view Items");
            System.out.println("2. Borrow Item");
            System.out.println("3. Return Item");
            System.out.println("4. Read Sample");
            System.out.println("5. Flip Pages");
            System.out.println("6. Play Digital Media");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            
            
            option = Console.readInt("Choose an option: ");
            verifyConsoleInput(option);
        }while(option != 7);
    }

    public static void verifyConsoleInput(int input) {
        
        switch (input) {
            case 1:
                LibraryService.viewItems();
                break;
            case 2:
                LibraryService.selectToBorrowItem();
                break;
            case 3:
                LibraryService.selectToReturnItem();
                break;
            case 4:
                LibraryService.readExampleIsNotBorrowed();
                break;
            case 5:
                LibraryService.flipPagesIsNotBorrowed();
                break;
            case 6:
                LibraryService.playDigitalMedia();
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }
}
