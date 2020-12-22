

public class AdvancedAstrology {
    

    public static void printStars(int number) {
        // part 1 of the exercise
        
        for (int numberOfStars = 0; numberOfStars < number; numberOfStars++) {
            System.out.print("*"); 
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int numberOfSpaces = 0; numberOfSpaces < number; numberOfSpaces++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int spaces = size - 1;
        int stars = 1;
        
        for (int count = 0; count < size; count++) {
            printSpaces(spaces);
            spaces--;
            printStars(stars);
            stars++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        int treeStars = 1;
        
        
        for (int treeSpaces = height - 1; treeSpaces >= 0; treeSpaces--) {
            printSpaces(treeSpaces);
            printStars(treeStars);
            treeStars += 2;
        }
        for (int trunkCount = 0; trunkCount < 2; trunkCount++) {
            printSpaces(height -2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely
        

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
