public class Cookie extends DessertItem {
    private int number;
    private int pricePerDozen;
    private int calories;

    public Cookie(){}

    public Cookie(String name, int number, int pricePerDozen)
    {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }

    public Cookie(String name, int number, int pricePerDozen, int calories) {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
        this.calories = calories;
    }

    public int getCost() {
        return (int)Math.round(pricePerDozen / 12.0 * number);
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

    @Override
    public String toString() {
        return (getNumber() + " @ " + getPricePerDozen() + " /dz.\n" + getName());
    }

    public static void main(String[] args) {
        Cookie cookie0 = new Cookie();
        Cookie cookie1 = new Cookie("Oreo", 12, 400);
        Cookie cookie2 = new Cookie("Chocolate Chip", 5, 333);
        Cookie cookie3 = new Cookie("Peanut Butter", 8, 235);
        System.out.println("Cookie 0 " + cookie0.getName() + " Number " + cookie0.getNumber() + " Price/Dozen " + cookie0.getPricePerDozen() + " Cost " + cookie0.getCost());
        System.out.println("Cookie 1 " + cookie1.getName() + " Number " + cookie1.getNumber() + " Price/Dozen " + cookie1.getPricePerDozen() + " Cost " + cookie1.getCost());
        System.out.println("Cookie 2 " + cookie2.getName() + " Number " + cookie2.getNumber() + " Price/Dozen " + cookie2.getPricePerDozen() + " Cost " + cookie2.getCost());
        System.out.println("Cookie 3 " + cookie3.getName() + " Number " + cookie3.getNumber() + " Price/Dozen " + cookie3.getPricePerDozen() + " Cost " + cookie3.getCost());
        cookie0.setName("Raisin");
        System.out.println("Cookie 0 name is now Raisin Result = " + cookie0.getName());
        cookie1.setNumber(2);
        System.out.println("Cookie 1 number is now 2 Result = " + cookie1.getNumber());
        cookie2.setPricePerDozen(565);
        System.out.println("Cookie 2 price per dozen is now 565 cents " + cookie2.getPricePerDozen());
        System.out.println(cookie1);
    }
}
