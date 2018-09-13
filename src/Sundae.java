import java.util.ArrayList;
import java.util.List;

public class Sundae extends IceCream {
    private List<DessertItem> toppings;
    private int calories;

    public Sundae() {
        calories = 0;
        this.toppings = new ArrayList<>();
    }


    public Sundae(String iceCreamFlavor, int cost) {
        super(iceCreamFlavor, cost);
        this.toppings = new ArrayList<>();
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
