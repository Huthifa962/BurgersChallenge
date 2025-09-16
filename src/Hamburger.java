public class Hamburger {

    private String type;
    private double price;

    private String topping1;
    private double topping1Price;

    private String topping2;
    private double topping2Price;

    private String topping3;
    private double topping3Price;

    public Hamburger(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public void addTopping1(String name, double price){
        this.topping1 = name;
        this.topping1Price = price;
    }

    public void addTopping2(String name, double price){
        this.topping2 = name;
        this.topping2Price = price;
    }

    public void addTopping3(String name, double price){
        this.topping3 = name;
        this.topping3Price = price;
    }

    public double itemizeBurger(){

        double totalPrice = this.price;
//        PrintStream printf = System.out.printf(type + "burger, base price: " = this.price);
//        System.out.println(this.type + "burger, base price: " = this.price);

        if (topping1 != null){
            totalPrice += topping1Price;
            System.out.println("Added " + topping1 + " for " + topping1Price);
        }

        if (topping2 != null){
            totalPrice += topping2Price;
            System.out.println("Added " + topping2 + " for " + topping2Price);
        }

        if (topping3 != null){
            totalPrice += topping3Price;
            System.out.println("Added " + topping3 + " for " + topping3Price);
        }

        return totalPrice;
    }
}
