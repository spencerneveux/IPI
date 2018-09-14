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
        double tax = taxRate / 100;
        return (int)Math.round(totalCost() * tax);
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
            sb.append("\n" + items + " " + String.format("%.2f", items.getCost() / 100.0));
        }
        sb.append("\nTax " + String.format("%.2f", totalTax() / 100.0) + "\nTotal Cost "
                + String.format("%.2f", (totalCost() + totalTax()) / 100.0));
        return sb.toString();
    }

    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        checkout.enterItem(new Candy("m&m", 2.4, .89));
        checkout.enterItem(new Cookie("Oreo", 7, 412));
        checkout.enterItem(new IceCream("Chocolate", 134));
        System.out.println(checkout);
        System.out.println();
        checkout.clear();
        System.out.println(checkout);
        System.out.println();


        Checkout checkout1 = new Checkout(6.5);
        checkout1.enterItem(new Candy("Milky Way", 1, 100));
        checkout1.enterItem(new Cookie("Peanut Butter", 3, 100));
        System.out.println(checkout1);
    }
}
