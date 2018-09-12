import java.util.ArrayList;
import java.util.List;

public class Sundae extends IceCream {
    private List<DessertItem> toppings;

    public Sundae() {}

    public Sundae(String iceCreamFlavor, int cost, ArrayList<DessertItem> toppings) {
        super(iceCreamFlavor, cost);
        this.toppings = new ArrayList<>(toppings);
    }

    public int getCost() {
        int cost = 0;
        for (DessertItem itemCost : toppings) {
            cost += itemCost.getCost();
        }
        cost += super.getCost();
        return cost;
    }

}
