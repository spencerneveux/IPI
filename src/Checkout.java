import java.util.ArrayList;
import java.util.List;

public class Checkout {
    private List<DessertItem> dessertList;
    private double taxRate;

    /**
     * Null Constuctor for checkout class
     */
    public Checkout()
    {
        dessertList = new ArrayList<>();
    }

    /**
     * Overloaded constructor for checkout class
     * @param taxRate double value taxrate
     */
    public Checkout(double taxRate) {
        this.taxRate = taxRate;
        dessertList = new ArrayList<>();
    }

    /**
     * method to clear all items from dessertList
     */
    public void clear()
    {
        dessertList.clear();
    }

    /**
     * Method to enter item into checkout
     * @param item DessertItem objects
     */
    public void enterItem(DessertItem item)
    {
        dessertList.add(item);
    }

    /**
     * Method to return num of items in dessertLIst
     * @return int value num of items
     */
    public int numberOfItems()
    {
       return dessertList.size();
    }

    /**
     * Method to get total cost of all items in checkout
     * @return int value of total cost
     */
    public int totalCost()
    {
        int cost = 0;
        for (DessertItem item : dessertList) {
            cost += item.getCost();
        }
        return cost;
    }

    /**
     * Method to get total tax on all items in checkout
     * @return int value of total tax
     */
    public int totalTax()
    {
        double tax = taxRate / 100;
        return (int)Math.round(totalCost() * tax);
    }

    /**
     * Getter for tax rate
     * @return double for tax rate value
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * Setter for tax rate
     * @param taxRate double value for tax rate
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * Overriding toString method
     * @return string representation for receipt
     */
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
