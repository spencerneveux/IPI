public class BakeryTester {
    public static void main(String[] args) {
        Checkout checkout = new Checkout(6.5);
        checkout.enterItem(new Cookie("Chocolate Chip Cookie", 4, 399));
        checkout.enterItem(new Candy("Fudge", 2.25, 399));
        checkout.enterItem(new IceCream("Vanilla", 105));
        checkout.enterItem(new Sundae("Chocolate chip", 195));


        System.out.println("Number of items " + checkout.numberOfItems());
        System.out.println();
        System.out.println("Total Cost: " + checkout.totalCost());
        System.out.println();
        System.out.println("Total tax: " + checkout.totalTax());
        System.out.println();
        System.out.println("Cost + Tax " + (checkout.totalTax() + checkout.totalCost()));
        System.out.println();
        System.out.println(checkout);
    }
}
