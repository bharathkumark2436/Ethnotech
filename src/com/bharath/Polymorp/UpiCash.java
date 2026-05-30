package com.bharath.Polymorp;

interface UPI{
    void UpiPayment();
}

interface Cash{
    void CashPayment();
}

class payment implements UPI , Cash {
    @Override
    public void UpiPayment() {
        System.out.println("UPI payment");
    }
    @Override
    public void CashPayment() {
        System.out.println("Cash Payment");
    }
}
public class UpiCash {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        payment pay = new payment();
        pay.UpiPayment();
        pay.CashPayment();
    }

}