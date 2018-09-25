public class Candy extends DessertItem {
    private double weight;
    private double priceLb;
    private int calories;
    private int cost;

    public Candy() {}

    public Candy(String name, double weight, double priceLb)
    {
        super(name);
        this.weight = weight;
        this.priceLb = priceLb;
        setCost(weight, priceLb);
    }

    public Candy(String name, double weight, double priceLb, int calories) {
        super(name);
        this.weight = weight;
        this.priceLb = priceLb;
        this.calories = calories;
        setCost(weight, priceLb);
    }

    public int getCost()
    {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public double getPriceLb() {
        return priceLb;
    }

    public int getCalories() {
        return calories;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPriceLb(double priceLb) {
        this.priceLb = priceLb;
    }

    public void setName(String name) {
        super.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setCost(double weight, double priceLb) {
        if (cost < 0)
            throw new IllegalArgumentException("Negative cost is not allowed");
        else if (priceLb < 100)
            this.cost = (int)Math.round(weight * priceLb * 100);
        else
            this.cost = (int)Math.round(weight * priceLb);
    }

    @Override
    public String toString() {
        String result = getWeight() + " lbs. @ " + getPriceLb() + " /lb.\n"
            + String.format("%-27.24s %5.2f", getName(), getCost() / 100.0);
        return result;
    }

}
