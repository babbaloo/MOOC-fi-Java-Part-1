
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService messages = new MessagingService();
        //Message num1 = new Message("George", "Hey man");
        //messages.add(num1);
        //Message num2 = new Message("Ditra", "Coolbeans");
        //messages.add(num2);
        Message num3 = new Message("Carey", "1234567Hey guys! I feel SO sorry for those of you who have to abbreviate tweets because you only have 140 characters. Soooooooo lame! Anyway, what’s everyone doing today? I’m just type-type-typing away! SO many characters! Talk to you soon. #blessed #280characters #abcdefg");
        messages.add(num3);
        System.out.println(messages.getMessages());
        
    }
}
