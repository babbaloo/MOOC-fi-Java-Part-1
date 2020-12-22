import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name: ");
            String showName = String.valueOf(scanner.nextLine());
            if (showName.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int showDuration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(showName, showDuration));
        }
        System.out.println("");
        
        System.out.print("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram each : programs) {
            if (each.getDuration() <= maxDuration) {
                System.out.println(each);
            }
        }

    }
}
