public class Cookie extends DessertItem {
    private int number;
    private int pricePerDozen;
    private int calories;
    private int cost;

    public Cookie(){
        this("", 0, 0);
    }

    public Cookie(String name, int number, int pricePerDozen)
    {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
        setCost(number, pricePerDozen);
    }

    public Cookie(String name, int number, int pricePerDozen, int calories) {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
        this.calories = calories;
        setCost(number, pricePerDozen);
    }

    public int getCost() {
        return cost;
    }

    public int getNumber() {
        return number;
    }

    public int getCalories() {
        return calories;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPricePerDozen() {
        return pricePerDozen;
    }

    public void setPricePerDozen(int pricePerDozen) {
        this.pricePerDozen = pricePerDozen;
    }

    public void setName(String name) {
        super.name = name;
    }

    public void setCalories(int calories){
        this.calories = calories;
    }

    public void setCost(int number, int pricePerDozen) {
        if (number == 12)
            cost = pricePerDozen;
        else {
            cost = (int)Math.round(pricePerDozen / 12.0 * number);
        }
    }

    @Override
    public String toString() {
        String result = getNumber() + " @ " + getPricePerDozen() + " /dz.\n"
                + String.format("%-27.24s %5.2f", getName(), getCost() / 100.0);
        return result;
    }
}
