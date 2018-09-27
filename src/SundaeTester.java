public class SundaeTester {
    public static void main(String[] args) {
        // Null Constructor
        Sundae sundaeNull = new Sundae();
        System.out.println(sundaeNull.getCost());

        // Testing Constructor
        Sundae sundae = new Sundae(new Candy("Hot Fudge", .5, .9), "Chocolate Chip", 300);
        System.out.println(sundae.getCost());

        // Testing addToppings
        sundae.addToppings(new Candy("Gummy Worms", .25, 100));
        System.out.println(sundae);

        // Testing setCalories
        sundae.setCalories(100);
        System.out.println(sundae.getCalories());


    }
}
