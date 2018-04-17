public class Customer {

    private String name;
    private double wallet;
    private int tableNumber;

    public Customer(String name, double wallet, int tableNumber){
        this.name = name;
        this.wallet = wallet;
        this.tableNumber = tableNumber;
    }

    public String getName(){
        return this.name;
    }

    public double getWallet(){
        return this.wallet;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void pay(double cost){
        wallet -= cost;
    }

    public Order placeOrder(){
        Order order = new Order( 1, MenuItem.LETTUCE);
        return order;
    }

}
