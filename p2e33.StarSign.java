
import java.util.Scanner;

public class StarSign {

    public static void main(String[] args) {
    
        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        Scanner scanner = new Scanner(System.in);
int values = 0;
int sum = 0;

while (true) {
    System.out.println("Provide a value, a negative value ends the program");
    int value = Integer.valueOf(scanner.nextLine());
    if (value < 0) {
        break;
    }

    values = values + 1;
    sum = sum + value;
}

if (sum == 0) {
    System.out.println("The average of the values could not be calculated.");
} else {
    System.out.println("Average of values: " + (1.0 * sum / values));
}
        
        /*printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(12);
        System.out.println("\n---");*/
    }

    public static void printStars(int number) {
        // first part of the exercise
        int count = 0;
        while (count < number) {
            System.out.print("*");
            count++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int lines = 0;
        
        while (lines < size) {
            for (int count = 0; count < size; count++) {
                System.out.print("*");
            }
            System.out.println("");
            lines++;
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int lines = 0;
        
        while (lines < height) {
            for (int count = 0; count < width; count++) {
                System.out.print("*");
            }
            System.out.println("");
            lines++;
        }
        
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int line = 0;
        int numberOfStars = 1;
        
        while (line < size) {
            for (int prints = 0; prints < numberOfStars; prints++) {
                System.out.print("*");
            }
            System.out.println("");
            numberOfStars++;
            line++;
        }
        
        
    }
}
