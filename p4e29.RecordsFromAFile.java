
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while(fileReader.hasNextLine()) {
                String fullValue = fileReader.nextLine();
                if (fullValue.equals("")) {
                    continue;
                }
                String[] eachValue = fullValue.split(",");
                if (eachValue[1].equals("1")) {
                    System.out.println(eachValue[0] + ", age: " + eachValue[1] + " year");
                } else {
                    System.out.println(eachValue[0] + ", age: " + eachValue[1] + " years");
                }
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
