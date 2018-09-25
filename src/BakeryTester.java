public class BakeryTester {
    public static void main(String[] args) {
        // Checkout Tester 1
        Checkout checkout = new Checkout(6.5);
        checkout.enterItem(new Cookie("Chocolate Chip", 4, 399));
        checkout.enterItem(new Candy("Fudge", 2.25, 399));
        checkout.enterItem(new IceCream("Vanilla", 105));


        System.out.println("Number of items " + checkout.numberOfItems());
        System.out.println();
        System.out.println("Total Cost: " + checkout.totalCost());
        System.out.println();
        System.out.println("Total tax: " + checkout.totalTax());
        System.out.println();
        System.out.println("Cost + Tax " + (checkout.totalTax() + checkout.totalCost()));
        System.out.println();
        System.out.println(checkout);
        System.out.println();


        // Checkout tester 2
        Checkout checkout1 = new Checkout(6.5);
        checkout1.enterItem(new IceCream("Strawberry", 145));
        checkout1.enterItem(new Sundae(new Candy("Caramel", 1.0, 0.1), "Vanilla", 145));
        checkout1.enterItem(new Candy("Gummy Worms", 1.33, .89));
        checkout1.enterItem(new Cookie("Chocolate Chip", 4, 399));
        checkout1.enterItem(new Candy("Salt Water Taffy", 1.50, 2.09));
        checkout1.enterItem(new Candy("Candy Corn", 3.00, 1.09));

        System.out.println("Number of items " + checkout1.numberOfItems());
        System.out.println();
        System.out.println("Total Cost: " + checkout1.totalCost());
        System.out.println();
        System.out.println("Total tax: " + checkout1.totalTax());
        System.out.println();
        System.out.println("Cost + Tax " + (checkout1.totalTax() + checkout1.totalCost()));
        System.out.println();
        System.out.println(checkout1);
    }
}
