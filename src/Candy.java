//Spencer Neveux
// IPI
// CECS 277
// 9/27/18

public class Candy extends DessertItem {
    private double weight;
    private double priceLb;
    private int calories;
    private int cost;

    /**
     * Null constructor for Candy
     */
    public Candy() {
        this("", 0, 0);
    }

    /**
     * Overloaded constructor for Candy
     * @param name name of candy
     * @param weight double representing weight of candy
     * @param priceLb double representing price/lb
     */
    public Candy(String name, double weight, double priceLb)
    {
        super(name);
        this.weight = weight;
        this.priceLb = priceLb;
        setCost(weight, priceLb);
    }

    /**
     * Overloaded constructor including calories
     * @param name name of candy
     * @param weight double representing weight of candy
     * @param priceLb double representing price/lb
     * @param calories int value representing calories
     */
    public Candy(String name, double weight, double priceLb, int calories) {
        super(name);
        this.weight = weight;
        this.priceLb = priceLb;
        this.calories = calories;
        setCost(weight, priceLb);
    }

    /**
     * Getter for cost
     * @return int value of cost
     */
    public int getCost()
    {
        return cost;
    }

    /**
     * Getter for weight
     * @return double value of weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Getter for price per pound
     * @return double value of price/lb
     */
    public double getPriceLb() {
        return priceLb;
    }

    /**
     * Getter for calories
     * @return int value of calories
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Setter for weight
     * @param weight double value
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Setter for price/lb
     * @param priceLb double value
     */
    public void setPriceLb(double priceLb) {
        this.priceLb = priceLb;
    }

    /**
     * Setter for name of candy
     * @param name string value for candy
     */
    public void setName(String name) {
        super.name = name;
    }

    /**
     * Setter for calories
     * @param calories int value
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
     * Setter for Cost
     * @param weight double value of weight
     * @param priceLb double value for price/lb
     */
    public void setCost(double weight, double priceLb) {
        if (cost < 0)
            throw new IllegalArgumentException("Negative cost is not allowed");
        else if (priceLb < 100)
            this.cost = (int)Math.round(weight * priceLb * 100);
        else
            this.cost = (int)Math.round(weight * priceLb);
    }

    /**
     * Overriding toSTring method
     * @return String value of candy
     */
    @Override
    public String toString() {
        String result = getWeight() + " lbs. @ " + getPriceLb() + " /lb.\n"
            + String.format("%-27.24s %5.2f", getName(), getCost() / 100.0);
        return result;
    }

}
