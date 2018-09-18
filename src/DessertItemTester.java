import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DessertItemTester {
    public static void main(String[] args) {
        Candy milkyway = new Candy("MilkyWay", .2, 399);
        Candy airheads = new Candy("Airhead", .3, 299);
        Cookie chocCookie = new Cookie("Chocolate Chip", 4, 499);
        Cookie oatCookie = new Cookie("Oatmeal", 5, 299);
        Cookie pbCookie = new Cookie("PB", 5, 299);
        IceCream chocolate = new IceCream("Chocolate", 499);
        IceCream vanilla = new IceCream("Vanilla", 299);

        System.out.println("milkyway " + milkyway.getCost());
        System.out.println("airhead " +airheads.getCost());
        System.out.println("chocCookie " + chocCookie.getCost());
        System.out.println("oatCookie " + oatCookie.getCost());
        System.out.println("pbCookie " + pbCookie.getCost());
        System.out.println("chocolate " + chocolate.getCost());
        System.out.println("vanilla " + vanilla.getCost());

        System.out.println("Result should be -1 Result: " + milkyway.compareTo(airheads));
        System.out.println("Result should be 1 Result: " + airheads.compareTo(milkyway));
        System.out.println("Result should be 1 Result: " + chocCookie.compareTo(oatCookie));
        System.out.println("Result should be 0. Result: " + pbCookie.compareTo(oatCookie));
        System.out.println("Result should be 1. Result: " + chocolate.compareTo(vanilla));
        System.out.println("Result should be -1 Result: " + milkyway.compareTo(pbCookie));


        List<DessertItem> list = new ArrayList<>();
        list.add(milkyway);
        list.add(airheads);
        list.add(chocCookie);
        list.add(oatCookie);
        list.add(pbCookie);
        list.add(chocolate);
        list.add(vanilla);

        System.out.println(list);
        System.out.println();
        Collections.sort(list);
        System.out.println(list);
    }
}
