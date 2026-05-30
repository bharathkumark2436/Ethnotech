package com.bharath.Arrays;

public class Temperature {
    public static void main(String[] args) {
        int[] temp={20,25,45,5,6,1,3,4,33,4,44,60,45,50,55,34,45,50,45,35,55,35,8,26,36,56,20,23,26,55,76};
        int hig=Integer.MIN_VALUE,low=Integer.MAX_VALUE,ave=0;
        int sum=0;
        int count=0;
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]>hig)
                hig=temp[i];
            else if(temp[i]<low)
                low=temp[i];
            sum+=temp[i];
            if(temp[i]>35)
                count++;

        }
        ave=sum/temp.length;
        System.out.println("high: "+hig);
        System.out.println("low: "+ low);
        System.out.println("ave: "+ave);
        System.out.println("hot days: "+count);

    }
}
