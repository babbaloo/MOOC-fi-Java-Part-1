
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        String wordElement = "";
        if (this.elements.size() == 1) {
            wordElement = " element";
        } else {
            wordElement = " elements";
        }
        String printList = "";
        for (int i = 0; i < this.elements.size() - 1; i++) {
            String each = this.elements.get(i);
            printList = printList + each + "\n";
        }
        printList += this.elements.get(this.elements.size() - 1);
        return "The collection " + this.name + " has " + this.elements.size() + wordElement + ":" + "\n" + 
                printList;
    }
    
}
