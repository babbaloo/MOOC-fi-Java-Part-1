
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // test your program here!
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Day?");
            int day = Integer.valueOf(scanner.nextLine());
            System.out.println("Month?");
            int month = Integer.valueOf(scanner.nextLine());
            System.out.println("Year?");
            int year = Integer.valueOf(scanner.nextLine());
            System.out.println("How many days?");
            int howManyDays = Integer.valueOf(scanner.nextLine());
            int dayTotal = day + howManyDays;
            day += howManyDays % 30;
            int advanceMonth = 0;
                    
            if (day > 30) {
                day -= 30;
            }
            if (dayTotal > 30) {
                advanceMonth = dayTotal / 30;
                if (dayTotal % 30 == 0) {
                    advanceMonth -= 1;
                }
                month += advanceMonth;
            }
            if (month > 12) {
                year = year + month / 12;
                if (month % 12 == 0) {
                    year--;
                }
                month -= 12;
            }
            
            System.out.println(day + ", " + month + ", " + year);
        }
    }
}
