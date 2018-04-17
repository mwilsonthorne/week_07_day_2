import java.util.ArrayList;

public class Kitchen {

    private ArrayList<Order> prep;
    private ArrayList<Dish> pass;

    public Kitchen(ArrayList<Order> prep, ArrayList<Dish> pass){
        this.prep = new ArrayList<>();
        this.pass = new ArrayList<>();
    }

    public ArrayList<Dish> getPass() {
        return pass;
    }

    public ArrayList<Order> getPrep() {
        return prep;
    }

    public void addOrderToKitchen(Waiter waiter) {
        Order order = waiter.giveOrderToKitchen();
        prep.add(order);

    }
}
