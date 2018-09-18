import java.util.ArrayList;
import java.util.List;

public class Sundae extends IceCream {
    private List<DessertItem> toppings;
    private int calories;

    public Sundae() {
    }


    public Sundae(DessertItem topping, String iceCreamFlavor, int cost) {
        super(iceCreamFlavor, cost);
        this.toppings = new ArrayList<>();
        toppings.add(topping);
    }

    public Sundae(String iceCreamFlavor, int cost, int calories) {
        super(iceCreamFlavor, cost, calories);
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

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        for (DessertItem item : toppings) {
            if (item instanceof Candy)
                calories += ((Candy) item).getCalories();
            else if (item instanceof Cookie)
                calories += ((Cookie) item).getCalories();
            else if (item instanceof IceCream)
                calories += ((IceCream) item).getCalories();
        }

        return calories;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (DessertItem item : toppings) {
            sb.append(item.getName() + " ");
        }
        sb.append("Sundae with\n" + super.toString());
        return sb.toString();
    }

}
