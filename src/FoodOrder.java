abstract class FoodOrder {
    String customerName;
    int quantity;
    double price;

    FoodOrder(String name, int quantity, double price) {
        customerName = name;
        this.quantity = quantity;
        this.price = price;
    }

    abstract void orderfood();

    void generatebill() {
        double total = quantity * price;

        System.out.println("Customer Name: " + customerName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price Per Item: " + price);
        System.out.println("Total Bill: " + total);
    }
}

class PizzaOrder extends FoodOrder {

    PizzaOrder(String name, int quantity, double price) {
        super(name, quantity, price);
    }

    @Override
    void orderfood() {
        System.out.println(customerName + " ordered Pizza.");
    }

    @Override
    void generatebill() {
        double total = quantity * price;

        System.out.println("----- Pizza Bill -----");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Pizza Quantity: " + quantity);
        System.out.println("Price Per Pizza: " + price);
        System.out.println("Total Amount: " + total);
        System.out.println("----------------------");
    }
}

class Hello {
    public static void main(String[] args) {

        PizzaOrder order1 = new PizzaOrder("Bharath", 3, 250);

        order1.orderfood();
        order1.generatebill();
    }
}