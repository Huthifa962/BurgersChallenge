public class DeluxeBurger {

    private String deluxeTopping1;
    private String deluxeTopping2;

    public DeluxeBurger(){

        super();
        this.deluxeTopping1 = "Chips";
        this.deluxeTopping2 = "Drink";
    }


    public void addTopping1(String name, double price){
        System.out.println("No additional toppings allowed on a deluxe burger.");
    }

    public double itemizeBurger(){
        System.out.println("Deluxe burger comes with " + deluxeTopping1 + " and " + deluxeTopping2 + ".");
//        return super.notifyAll();
    }

}
