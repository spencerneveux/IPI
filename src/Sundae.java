import java.util.ArrayList;
import java.util.List;

public class Sundae extends IceCream {
    private List<DessertItem> toppings;
    private int calories;

    /**
     * Null Constructor for sundae
     */
    public Sundae() {
        super("", 0);
        toppings = new ArrayList<>();
    }


    /**
     * Overloaded constructor
     * @param topping DessertItem
     * @param iceCreamFlavor string for ice cream name
     * @param cost int value for cost of ice cream
     */
    public Sundae(DessertItem topping, String iceCreamFlavor, int cost) {
        super(iceCreamFlavor, cost);
        this.toppings = new ArrayList<>();
        toppings.add(topping);
    }

    /**
     * Overloaded constructor including calories
     * @param iceCreamFlavor string name for icecream flavor
     * @param cost int value for cost of ice cream
     * @param calories int value for calories in sundae
     */
    public Sundae(String iceCreamFlavor, int cost, int calories) {
        super(iceCreamFlavor, cost, calories);
        this.toppings = new ArrayList<>();
    }

    /**
     * Method to add toppings to sundae
     * @param item DessertItem object
     */
    public void addToppings(DessertItem item) {
        toppings.add(item);
    }

    /**
     * Getter for cost
     * @return int value cost
     */
    public int getCost() {
        int cost = 0;
        for (DessertItem itemCost : toppings) {
            cost += itemCost.getCost();
        }
        cost += super.getCost();
        return cost;
    }

    /**
     * Setter for calories
     * @param calories int value calories for ice cream
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
     * Getter for calories
     * @return int value calories
     */
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

    /**
     * Overriding toString method
     * @return string representation of sundae
     */
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
