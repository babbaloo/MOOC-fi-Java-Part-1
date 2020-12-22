
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter first = new Counter(5);
        first.increase();
        first.increase();
        first.decrease();
        System.out.println(first);
    }
}
