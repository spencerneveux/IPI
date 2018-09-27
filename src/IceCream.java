//Spencer Neveux
// IPI
// CECS 277
// 9/27/18
public class IceCream extends DessertItem {
    private int cost;
    private int calories;

    /**
     * Null Constructor for iceCream
     */
    public IceCream() {
        this("", 0, 0);
    }

    /**
     * Overloaded constructor for IceCream
     * @param name string value representing name of icecream
     */
    public IceCream(String name) {
        super(name);
    }

    /**
     * Overloaded constructor for ice cream including cost
     * @param name string value for name of ice cream
     * @param cost int value for cost of ice cream
     */
    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    /**
     * Overloaded constructor including calories
     * @param name string value for name of ice cream
     * @param cost int value for cost of ice cream
     * @param calories int value for calories in ice cream
     */
    public IceCream(String name, int cost, int calories) {
        super(name);
        this.cost = cost;
        this.calories = calories;
    }

    /**
     * Setter for cost of ice cream
     * @param cost int value for cost of ice cream
     */
    public void setCost(int cost) {
        if (cost < 0)
            throw new IllegalArgumentException("Not a valid cost. Value must be positive");
        else
            this.cost = cost;
    }

    /**
     * Getter for cost of ice cream
     * @return int value cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * Getter for calories
     * @return int value for calories
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Setter for calories
     * @param calories int value calories for ice cream
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
     * Overriding toString method
     * @return string representation of ice cream
     */
    @Override
    public String toString() {
        String result = String.format("%-27.24s %5.2f", getName(), getCost() / 100.0);
        return result;
    }


}
