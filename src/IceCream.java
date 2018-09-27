public class IceCream extends DessertItem {
    private int cost;
    private int calories;

    public IceCream() {
        this("", 0, 0);
    }

    public IceCream(String name) {
        super(name);
    }

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    public IceCream(String name, int cost, int calories) {
        super(name);
        this.cost = cost;
        this.calories = calories;
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

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        String result = String.format("%-27.24s %5.2f", getName(), getCost() / 100.0);
        return result;
    }


}
