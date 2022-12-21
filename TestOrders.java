public class TestOrders {
    public static void main(String[] args) {

        Item item1 = new Item("mocha", 2.0);
        Item item2 = new Item("latte", 1.5);
        Item item3 = new Item("cappuccino", 2.5);
        Item item4 = new Item("drip coffee", 1.0);

        Order order1 = new Order();
        order1.display();

        Order order2 = new Order();
        order2.display();

        Order order3 = new Order("Sam");
        order3.addItem(item1);
        order3.addItem(item2);
        order3.display();
        order3.setReady(true);
        System.out.println(order3.getStatusMessage());

        Order order4 = new Order("Jimmy");
        order4.addItem(item4);
        order4.addItem(item1);
        order4.display();

        Order order5 = new Order("Cindhuri");
        order5.addItem(item2);
        order5.addItem(item3);
        order5.display();
    }

}
