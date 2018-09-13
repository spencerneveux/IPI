import java.util.ArrayList;
import java.util.List;

public class Sundae extends IceCream {
    private List<DessertItem> toppings;

    public Sundae() {
        this.toppings = new ArrayList<>();
    }

    public Sundae(String iceCreamFlavor, int cost) {
        super(iceCreamFlavor, cost);
        this.toppings = new ArrayList<>();
    }

    public void addToppings(DessertItem item) {
        toppings.add(item);
    }

    public int getCost() {
        int cost = 0;
        for (DessertItem itemCost : toppings) {
            cost += itemCost.getCost();
        }
        cost += super.getCost();
        return cost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (DessertItem item : toppings) {
            sb.append(item.getName() + " ");
        }
        sb.append("Sundae with\n" + super.getName() + " Ice Cream");
        return sb.toString();
    }

    public static void main(String[] args) {
        Sundae sundae0 = new Sundae("Chocolate Chip", 300);
        sundae0.addToppings(new Candy("Hot Fudge", .5, 100));
        sundae0.addToppings(new Candy("m&ms", .4, 98));
        System.out.println(sundae0);
    }

}
