import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WaiterTest {

    private Waiter waiter1;
    private Order order1;
    private Order order2;
    private Order order3;
    private ArrayList<Order> orders;


    @Before
    public void before() {
        order1 = new Order(3, MenuItem.LATTE);
        orders = new ArrayList<Order>();
        waiter1 = new Waiter("Todd", 100.00, orders);
    }

    @Test
    public void hasName() {
        assertEquals("Todd", waiter1.getName());
    }

    @Test
    public void hasBumBagCash() {
        assertEquals(100d, waiter1.getBumBagCash(), 0.01);
    }

    @Test
    public void orderPadIsEmpty(){
        assertEquals(0, orders.size());
    }

    @Test
    public void canAddOrderToPad(){
        orders.add(order1);
        assertEquals(1, orders.size());
    }

    @Test
    public void canTakeOrder(){
        orders = waiter1.takeOrder(order1);
       assertEquals(1, orders.size());
    }
//
//    @Test
//    public void canGiveOrderToKitchen(){
//        waiter1.takeOrder(order1);
//        waiter1.takeOrder(order2);
//        Order orderIGot = waiter1.giveOrderToKitchen();
//        assertEquals(1, orders.size());
//    }


}