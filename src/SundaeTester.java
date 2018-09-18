public class SundaeTester {
    public static void main(String[] args) {
        Sundae sundae = new Sundae(new Candy("Hot Fudge", .5, .9), "Chocolate Chip", 300);
        System.out.println(sundae.getCost());
    }
}
