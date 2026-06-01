package com.bharath.Recursion;
import java.util.*;
public class Studentmarklist_jagged {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr = new int[3][];

        arr[0] = new int[] { 1, 2, 3 };
        arr[1] = new int[] { 4, 5 };
        arr[2] = new int[] { 6, 7, 8, 9 };

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }



        int[][] student = new int[3][];

        student[0] = new int[2];
        student[1] = new int[3];
        student[2] = new int[4];
        for(int i=0;i<student.length;i++) {
            for (int j = 0;j<student[i].length; j++) {
                student[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<student.length;i++){
            for(int j=0;j<student[i].length;j++)
                System.out.print(student[i][j]);
            System.out.println();
        }
    }
}
