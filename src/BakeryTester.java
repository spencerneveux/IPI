public class BakeryTester {
    public static void main(String[] args) {
        // Checkout Tester 1
        Checkout checkout = new Checkout(6.5);
        checkout.enterItem(new Cookie("Chocolate Chip Cookie", 4, 399));
        checkout.enterItem(new Candy("Fudge", 2.25, 399));
        checkout.enterItem(new IceCream("Vanilla Ice Cream", 105));

        System.out.println(checkout);
        System.out.println();

        // Checkout tester 2
        Checkout checkout2 = new Checkout(6.5);
        checkout2.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
        checkout2.enterItem(new IceCream("Vanilla Ice Cream", 105));
        checkout2.enterItem(new Sundae(new Candy("Hot Fudge", 1, .45), "Choc. Chip Ice Cream", 150));
        checkout2.enterItem(new Cookie("Oatmeal Raisin Cookie", 4, 399));

        System.out.println(checkout2);
        System.out.println();

        // Checkout tester 3
        Checkout checkout1 = new Checkout(6.5);
        checkout1.enterItem(new IceCream("Strawberry Ice Cream", 145));
        checkout1.enterItem(new Sundae(new Candy("Caramel", 1.0, 0.1), "Vanilla Ice Cream", 145));
        checkout1.enterItem(new Candy("Gummy Worms", 1.33, .89));
        checkout1.enterItem(new Cookie("Chocolate Chip Cookie", 4, 399));
        checkout1.enterItem(new Candy("Salt Water Taffy", 1.50, 2.09));
        checkout1.enterItem(new Candy("Candy Corn", 3.00, 1.09));

        System.out.println(checkout1);
        System.out.println();

    }
}
