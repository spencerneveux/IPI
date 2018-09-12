public class Candy extends DessertItem {
    private double weight;
    private double priceLb;

    public Candy() {}

    public Candy(String name, double weight, double priceLb)
    {
        super(name);
        this.weight = weight;
        this.priceLb = priceLb;
    }

    public int getCost()
    {
        int cost = (int)Math.round(weight * priceLb * 100);
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public double getPriceLb() {
        return priceLb;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPriceLb(double priceLb) {
        this.priceLb = priceLb;
    }

    public static void main(String[] args) {
        Candy candy = new Candy("candy", 2.30, .89);
        System.out.println(candy.getCost() + " cents");
        Candy candy1 = new Candy();
        System.out.println(candy1.getWeight());
    }

}
