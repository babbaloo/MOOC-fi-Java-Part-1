
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        Statistics userSumAll = new Statistics();
        Statistics userSumEven = new Statistics();
        Statistics userSumOdd = new Statistics();
        
        System.out.println("Enter numbers: ");
        while(true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) {
                break;
            }
            if (userInput % 2 == 0) {
                userSumEven.addNumber(userInput);
            } else {
                userSumOdd.addNumber(userInput);
            }
            userSumAll.addNumber(userInput);
        }
        System.out.println("Sum: " + userSumAll.sum());
        System.out.println("Sum of even numbers: " + userSumEven.sum());
        System.out.println("Sum of odd numbers: " + userSumOdd.sum());
    }
}
