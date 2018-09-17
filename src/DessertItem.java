import sun.security.krb5.internal.crypto.Des;

public abstract class DessertItem implements Comparable<DessertItem> {

    protected String name;

    /**
     * Null constructor for DessertItem class
     */
    public DessertItem() {
        this("");
    }
    /**
     * Initializes DessertItem data
     */
    public DessertItem(String name) {
        this.name = name;
    }
    /**
     * Returns name of DessertItem
     * @return name of DessertItem
     */
    public final String getName() {
        return name;
    }
    /**
     * Returns cost of DessertItem
     * @return cost of DessertItem
     */
    public abstract int getCost();

    @Override
    public int compareTo(DessertItem item) {
        if (this.getCost() > item.getCost())
            return 1;
        else if (this.getCost() < item.getCost())
            return -1;
        else
            return 0;
    }

    public static DessertItem max(DessertItem item1, DessertItem item2) {
        if (item1.compareTo(item2) > 0)
            return item1;
        else
            return item2;
    }


}
