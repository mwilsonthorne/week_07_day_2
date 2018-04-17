public class Order {

    private int orderId;
    private int quantity;
    private MenuItem menuItem;

    public Order(int quantity, MenuItem menuItem){
        this.quantity = quantity;
        this.menuItem = menuItem;
        int randomNumber = (int) (Math.random()*1000.00);
        this.orderId = randomNumber;
    }

    public int getOrderId(){
        return this.orderId;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public MenuItem getMenuItem(){
        return this.menuItem;
    }



}
