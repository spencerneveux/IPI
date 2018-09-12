import java.util.ArrayList;
import java.util.List;

public class Checkout {
    List<DessertItem> dessertList;

    public Checkout()
    {
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
        return -1;
    }

    @Override
    public String toString()
    {
        String result = "";
        String header = " M & M Dessert Shoppe\n--------------------";

        return header;
    }

    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        checkout.enterItem(new Candy("m&m", 2.4, .89));
        System.out.println(checkout.totalCost() + " cents");
    }
}
