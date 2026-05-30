package com.bharath.Poly_Interface;

interface Notification{
    void sendmessages(String msg);
}
class Mobilenotification implements Notification{
    public void sendmessages(String msg){
        System.out.println("sending mobile notification :"+ msg);
    }
}
class Emailnotification implements Notification{
    public void sendmessages(String msg){
        System.out.println("sending Email notification :"+ msg);
    }
}
class Instanotification implements Notification{
    public void sendmessages(String msg){
        System.out.println("sending instaa notification :"+ msg);
    }
}
class Whatsappnotification implements Notification{
    public void sendmessages(String msg){
        System.out.println("sending Whatsapp notification :"+ msg);
    }
}

public class Notificationss {
    public static void main(String[] args) {


        Mobilenotification obj1 = new Mobilenotification();
        Emailnotification obj2 = new Emailnotification();
        Instanotification obj3 = new Instanotification();
        Whatsappnotification obj4 = new Whatsappnotification();
        obj1.sendmessages("hello there");
        obj2.sendmessages("bro");
        obj3.sendmessages("bloody sweet");
        obj4.sendmessages("black current");

    }
}
