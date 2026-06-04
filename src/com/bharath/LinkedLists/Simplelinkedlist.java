package com.bharath.LinkedLists;

class Nodesim{
    int data;
    Nodesim next;
    Nodesim(int data){
        this.data=data;
        this.next=null;
    }
}
public class Simplelinkedlist {
    public static void main(String[] args) {
        Nodesim first=new Nodesim(10);
        Nodesim second=new Nodesim(20);
        Nodesim third=new Nodesim(30);
        first.next=second;
        second.next=third;
        //System.out.println(first);
        Nodesim temp=first;
        
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
