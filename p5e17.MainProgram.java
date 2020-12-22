
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money have = new Money(10, 0);
        Money lost = new Money(7, 40);
        System.out.println(have.minus(lost));
    }
}
