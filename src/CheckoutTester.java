//Spencer Neveux
// IPI
// CECS 277
// 9/27/18
public class CheckoutTester {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        checkout.enterItem(new Candy("m&m", 2.4, .89));
        checkout.enterItem(new Cookie("Oreo", 7, 412));
        checkout.enterItem(new IceCream("Chocolate", 134));
        System.out.println(checkout);
        System.out.println();
        checkout.clear();
        System.out.println(checkout);
        System.out.println();


        Checkout checkout1 = new Checkout(6.5);
        checkout1.enterItem(new Candy("Milky Way", 1, 100));
        checkout1.enterItem(new Cookie("Peanut Butter", 3, 100));
        System.out.println(checkout1);
    }
}
