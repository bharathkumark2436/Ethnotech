package com.bharath.Poly_Interface;

class Customer {
    void booking(int distance) {
        System.out.println("Booking a ride");
    }
}

class Bike extends Customer {
    @Override
    void booking(int distance) {
        System.out.println("Bike booked");
    }
}

class Auto extends Customer {
    @Override
    void booking(int distance) {
        System.out.println("Auto booked");
    }
}

public class Poly_Uber {
    public static void main(String[] args) {

        int distance = 30;

        Customer ride;

        if (distance < 50) {
            ride = new Bike();
        } else {
            ride = new Auto();
        }

        ride.booking(distance);
    }
}