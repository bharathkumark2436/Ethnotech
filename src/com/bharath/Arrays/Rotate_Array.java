package com.bharath.Arrays;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int i = 0, j = arr.length - 1;
        int n=2;
        swap(arr, i, j);
        swap(arr,0,n-1);
        swap(arr,n,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
