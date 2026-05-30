package swiggy;

import java.util.*;

// Abstract class
abstract class FoodOrder1 {
    abstract void showMenu();
    abstract void printBill(int qty);
}

// Child class
class Swiggy extends FoodOrder1 {

    int price = 120;

    @Override
    void showMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Burger - Rs.120");
    }

    @Override
    void printBill(int qty) {
        System.out.println("Bill Amount = Rs." + (price * qty));
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodOrder1 order = new Swiggy();

        order.showMenu();

        System.out.print("Enter Burger Quantity: ");
        int qty = sc.nextInt();

        order.printBill(qty);
    }
}
