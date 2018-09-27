//Spencer Neveux
// IPI
// CECS 277
// 9/27/18
public class IceCreamTester {
    public static void main(String[] args) {
        IceCream iceCream0 = new IceCream();
        IceCream iceCream1 = new IceCream("Chocolate", 145);
        IceCream iceCream2 = new IceCream("Vanilla", 99);
        System.out.println(iceCream0);
        System.out.println(iceCream1);
        System.out.println(iceCream2);
        iceCream0.setCost(100);
        System.out.println("Ice Cream 0 now has cost of 100 Result = " + iceCream0.getCost());

    }
}
