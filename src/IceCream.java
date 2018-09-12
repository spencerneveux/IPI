public class IceCream extends DessertItem {
    private int cost;

    public IceCream() {}

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    public void setCost(int cost) {
        if (cost < 0)
            throw new IllegalArgumentException("Not a valid cost. Value must be positive");
        else
            this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return (name + "\t" + getCost());
    }

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
