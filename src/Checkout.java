import java.util.ArrayList;
import java.util.List;

public class Checkout {
    private List<DessertItem> dessertList;
    private double taxRate;

    public Checkout()
    {
        dessertList = new ArrayList<>();
    }

    public Checkout(double taxRate) {
        this.taxRate = taxRate;
        dessertList = new ArrayList<>();
    }

    public void clear()
    {
        dessertList.clear();
    }

    public void enterItem(DessertItem item)
    {
        dessertList.add(item);
    }

    public int numberOfItems()
    {
       return dessertList.size();
    }

    public int totalCost()
    {
        int cost = 0;
        for (DessertItem item : dessertList) {
            cost += item.getCost();
        }
        return cost;
    }

    public int totalTax()
    {
        double taxRate = 0.065;
        return (int)Math.round(totalCost() * taxRate);
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("M & M Dessert Shoppe\n--------------------");
        for (DessertItem items : dessertList) {
            sb.append("\n" + items.getName() + "\t" + items.getCost());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        checkout.enterItem(new Candy("m&m", 2.4, .89));
        checkout.enterItem(new Cookie("Oreo", 7, 412));
        checkout.enterItem(new IceCream("Chocolate", 134));
        System.out.println(checkout);
    }
}
