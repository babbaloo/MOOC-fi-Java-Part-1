
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        Package santa = new Package();
        Gift toy = new Gift("racecar", 1);
        System.out.println(toy);
        santa.addGift(toy);
        Gift book = new Gift("atlas", 2);
        System.out.println(book);
        santa.addGift(book);
        Gift bike = new Gift("schwinn", 12);
        System.out.println(bike);
        santa.addGift(bike);
        
        System.out.println(santa.totalWeight());
        
        

    }
}
