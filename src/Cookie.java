public class Cookie extends DessertItem {
    private int number;
    private int pricePerDozen;

    public Cookie(){}

    public Cookie(String name, int number, int pricePerDozen)
    {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }

    public int getCost() {
        return (int)Math.round(pricePerDozen / 12.0 * number);
    }


    public int getNumber() {
        return number;
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

    public static void main(String[] args) {
        Cookie cookie = new Cookie();
        Cookie cookie1 = new Cookie("Cookie", 4, 399);
        System.out.println(cookie);
        System.out.println(cookie1.getCost());
    }
}
