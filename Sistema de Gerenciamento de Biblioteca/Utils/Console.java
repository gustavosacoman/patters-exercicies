package Utils;

import java.util.Scanner;

public class Console {

    public static Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt) {
        int temp;
        while (true) {
            
        try{
            System.out.print(prompt);
           temp = scanner.nextInt();
            break;
        }catch(NumberFormatException e){
            System.out.println("invalid input. Please enter a valid integer.");
        }finally{
          scanner.nextLine();
        }
    }
        return temp;
    }

    public static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}

