
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name: ");
            String itemName = String.valueOf(scanner.nextLine());
            if (itemName.isEmpty()) {
                break;
            }
            items.add(new Item(itemName));
        }
        
        for (Item iterateItem : items) {
            System.out.println(iterateItem);
        }

    }
}
