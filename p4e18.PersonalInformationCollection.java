
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("First name: ");
            String firstName = String.valueOf(scanner.nextLine());
            if (firstName.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String lastName = String.valueOf(scanner.nextLine());
            
            System.out.print("Identification number: ");
            String idNumber = String.valueOf(scanner.nextLine());
            
            infoCollection.add(new PersonalInformation(firstName, lastName, idNumber));
        }
        System.out.println("");
        for (PersonalInformation each : infoCollection) {
            System.out.println(each.getFirstName() + " " + each.getLastName());
        }

    }
}
