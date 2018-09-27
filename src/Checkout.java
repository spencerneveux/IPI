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
        String result = "Number of Items " + numberOfItems() + "\n\n"
                + "Total Cost: " + totalCost() + "\n\nTotal Tax " + totalTax()
                + "\n\nCost + Tax " + (totalCost() + totalTax()) +
                "\n\n\tM & M Dessert Shoppe\n----------------------------\n";
        for (DessertItem item : dessertList) {
            result += item + "\n";
        }
        result += "\nTax " + String.format("%29.2f", totalTax() / 100.0) + "\nTotal Cost " + String.format("%23.2f", (totalCost() + totalTax()) / 100.0);
        return result;
    }

}
