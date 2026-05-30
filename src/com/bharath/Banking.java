package com.bharath;

public class Banking {
    private String name;
    private int balance;
    public Banking(String usrname,int balance) {
    this.name=usrname;
    this.balance=balance;
    }
    int  Balance(){
        return balance;

    }
    String name(){
        return name;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }

}

