public class Cookie extends DessertItem {
    private int number;
    private int pricePerDozen;
    private int calories;
    private int cost;

    /**
     * Null Constructor for cookie
     */
    public Cookie(){
        this("", 0, 0);
    }


    /**
     * Overloaded constructor for cookie
     * @param name string value for name
     * @param number int value for number of cookies
     * @param pricePerDozen int value for the price/dozen
     */
    public Cookie(String name, int number, int pricePerDozen)
    {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
        setCost(number, pricePerDozen);
    }

    /**
     * Overloaded constructor including calories
     * @param name string value for name
     * @param number int value for num of cookies
     * @param pricePerDozen int value for price/dozen
     * @param calories int value for calories per cookie
     */
    public Cookie(String name, int number, int pricePerDozen, int calories) {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
        this.calories = calories;
        setCost(number, pricePerDozen);
    }

    /**
     * Getter for cost
     * @return int value of cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * Getter for num of cookies
     * @return int value of cookies
     */
    public int getNumber() {
        return number;
    }

    /**
     * Getter for calories
     * @return int value of calorie per cookie
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Setter for num of cookies
     * @param number int value representing num of cookies
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Getter for price per dozen
     * @return int value price per dozen cookies
     */
    public int getPricePerDozen() {
        return pricePerDozen;
    }

    /**
     * Setter for price per dozen
     * @param pricePerDozen int value for price per dozen
     */
    public void setPricePerDozen(int pricePerDozen) {
        this.pricePerDozen = pricePerDozen;
    }

    /**
     * Setter for name
     * @param name string value representing name of cookie
     */
    public void setName(String name) {
        super.name = name;
    }

    /**
     * Setter for calories
     * @param calories int value for calorie per cookie
     */
    public void setCalories(int calories){
        this.calories = calories;
    }

    /**
     * Setter for cost
     * @param number int value for num cookies
     * @param pricePerDozen int value for price/dozen
     */
    public void setCost(int number, int pricePerDozen) {
        if (number == 12)
            cost = pricePerDozen;
        else {
            cost = (int)Math.round(pricePerDozen / 12.0 * number);
        }
    }

    /**
     * Overriding toString method
     * @return string value of cookie representation
     */
    @Override
    public String toString() {
        String result = getNumber() + " @ " + getPricePerDozen() + " /dz.\n"
                + String.format("%-27.24s %5.2f", getName(), getCost() / 100.0);
        return result;
    }
}
