package com.bharath.Arrays_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_arraylist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> playlist = new ArrayList<>();

        System.out.println("My first song:");
        String firstSong = scanner.nextLine();
        playlist.add(firstSong);

        System.out.println("My second song:");
        String secondSong = scanner.nextLine();
        playlist.add(secondSong);

        System.out.println("My third song:");
        String thirdSong = scanner.nextLine();
        playlist.add(thirdSong);

        System.out.println("My fourth song:");
        String fourthSong = scanner.nextLine();
        playlist.add(fourthSong);

        System.out.println("My fifth song:");
        String fifthSong = scanner.nextLine();
        playlist.add(fifthSong);

        System.out.println(playlist);

//        for(String song:playlist)
//            System.out.println(song);


        playlist.remove(1);


        String song = playlist.get(1);
        System.out.println("Song at index 1: " + song);


        playlist.set(2,"judas");
        boolean exists = playlist.contains("judas");
        System.out.println("Contains judas? " + exists);


        playlist.set(2,"savyasaachi");
        System.out.println(playlist.size());
        System.out.println(playlist.reversed());
        System.out.println("Playlist: " + playlist);

        scanner.close();
    }
}