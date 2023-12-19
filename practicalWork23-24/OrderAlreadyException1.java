public class OrderAlreadyException1 extends Exception{
    public OrderAlreadyException1(String ex){
        super("Order is already added at " + ex + " table");
    }
}
