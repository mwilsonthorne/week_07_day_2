import java.util.ArrayList;

public class Waiter {

    private String name;
    private double bumBagCash;
    private ArrayList<Order> orders;

    public Waiter(String name, double bumBagCash, ArrayList<Order> orders){
        this.name = name;
        this.bumBagCash = bumBagCash;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public double getBumBagCash() {
       return bumBagCash;
  }

    public ArrayList<Order> takeOrder(Order order){
        orders.add(order);
        return orders;
    }

    public Order giveOrderToKitchen() {

        return this.orders.remove(0);
    }
    public int getOrdersSize(){
        return orders.size();
    }
}
