package com.bharath.Poly_Interface;

interface camera{
    void click();
}
interface Musicplayer{
    void play();
}
class Mobile implements camera,Musicplayer{
    public void click(){
        System.out.println("click photos");

    }
    public void play(){
        System.out.println("play music");
    }


}
public class  Inter{
    public static void main(String[] args) {
        Mobile myphone=new Mobile();
        myphone.click();
        myphone.play();
    }
}
