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
        StringBuilder sb = new StringBuilder("\tM & M Dessert Shoppe\n----------------------------");
        for (DessertItem items : dessertList) {
            sb.append("\n" + items + " " + String.format("%.2f", items.getCost() / 100.0));
        }
        sb.append("\n\nTax " + String.format("%.2f", totalTax() / 100.0) + "\nTotal Cost "
                + String.format("%.2f", (totalCost() + totalTax()) / 100.0));
        return sb.toString();
    }

}
