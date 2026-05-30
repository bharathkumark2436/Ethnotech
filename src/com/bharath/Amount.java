package com.bharath;
class Amount extends Banking {
    public Amount(String name,int balance) {
        super(name, balance);
    }
    public void withdraw(int amount){
        setBalance(Balance()-amount);
            int finalbalance=super.Balance();
        System.out.println("finalbalance :"+finalbalance);
        }

    public static void main(String[] args) {
        Amount obj=new Amount("Bharath",200000);
        obj.withdraw(10000);
    }

}
