import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Title: ");
            String userTitle = scanner.nextLine();
            if (userTitle.equals("")) {
                break;
            }          
            System.out.print("Pages: ");
            int userPages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int userYear = Integer.valueOf(scanner.nextLine());
            
            bookList.add(new Book(userTitle, userPages, userYear));
        }
        System.out.println("");
        System.out.print("What information will be printed? ");
        String userInput = scanner.nextLine();
        if(userInput.equals("everything")) {
            for (Book each : bookList){
                System.out.println(each.getEverything());
            }
        } else if(userInput.equals("name")){
            for (Book each : bookList){
                System.out.println(each.getName());
            }
        }

    }
}
