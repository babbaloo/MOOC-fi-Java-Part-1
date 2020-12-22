
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersFromFile = new ArrayList<>();
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                numbersFromFile.add(Integer.valueOf(fileReader.nextLine()));
                
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int total = 0;
        for (int yes : numbersFromFile) {
            if (lowerBound <= yes && yes <= upperBound) {
                total++;
            }
        }
        System.out.println("Numbers: " + total);

    }

}
