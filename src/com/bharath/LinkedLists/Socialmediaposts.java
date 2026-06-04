package com.bharath.LinkedLists;

class Node {
    Node prev;
    Node nxt;
    String post;

    Node(String data) {
        this.post = data;
        this.prev = null;
        this.nxt = null;
    }
}

public class Socialmediaposts {

    Node head;
    Node curpost;


    void insertpost(String data) {

        Node newpost = new Node(data);

        if (head == null) {
            head = newpost;
            curpost = newpost;
            return;
        }

        Node temp = head;

        while (temp.nxt != null) {
            temp = temp.nxt;
        }

        temp.nxt = newpost;
        newpost.prev = temp;
    }

    void showpresentpost() {

        if (curpost != null) {
            System.out.println("Current Post : " + curpost.post);
        } else {
            System.out.println("No posts available");
        }
    }


    void nxtpost() {

        if (curpost != null && curpost.nxt != null) {

            curpost = curpost.nxt;

            System.out.println("Next Post : " + curpost.post);

        } else {

            System.out.println("No more posts");
        }
    }
    void prevpost() {

        if (curpost != null && curpost.prev != null) {

            curpost = curpost.prev;

            System.out.println("Previous Post : " + curpost.post);

        } else {

            System.out.println("No previous posts");
        }
    }

    public static void main(String[] args) {

        Socialmediaposts app = new Socialmediaposts();

        app.insertpost("Hello ");
        app.insertpost("get ur self together");
        app.insertpost("ohh, come on then");

        System.out.println("present post");
        app.showpresentpost();

        System.out.println("next post");
        app.nxtpost();

        System.out.println("next post");
        app.nxtpost();

        System.out.println("prev post");
        app.prevpost();
    }
}