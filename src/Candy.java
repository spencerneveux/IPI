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
        Candy candy0 = new Candy();
        Candy candy1 = new Candy("Milky Way", 2.25, .89);
        Candy candy2 = new Candy("Reeces", 1.4, .65);
        Candy candy3 = new Candy("Airhead", .9, .4);
        System.out.println("Weight " + candy0.getWeight() + " Price/lb " + candy0.getPriceLb() + " Cost " + candy0.getCost());
        System.out.println("Weight " + candy1.getWeight() + " Price/lb " + candy1.getPriceLb() + " Cost " + candy1.getCost());
        System.out.println("Weight " + candy2.getWeight() + " Price/lb " + candy2.getPriceLb() + " Cost " + candy2.getCost());
        System.out.println("Weight " + candy3.getWeight() + " Price/lb " + candy3.getPriceLb() + " Cost " + candy3.getCost());

    }

}
