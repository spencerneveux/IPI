
public abstract class DessertItem implements Comparable<Object> {

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
    public int compareTo(Object obj) {
        int value = 0;
        if (obj instanceof DessertItem) {
            DessertItem item = (DessertItem)obj;
        if (this.getCost() > item.getCost())
            value = 0;
        else if (this.getCost() < item.getCost())
            value = -1;
        else
            value = 0;
        }
        return value;
    }

    public static DessertItem max(DessertItem item1, DessertItem item2) {
        if (item1.compareTo(item2) > 0)
            return item1;
        else
            return item2;
    }


}
