package com.kunalkushwaha.searching.linear;

import java.util.Arrays;

public class LeetCodeExample {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,1234,-12,-123,0};

        System.out.println(getEvenNumCounter(nums));;
    }
    static int getEvenNumCounter(int[] arr){
        int counter=0;

        for(int a: arr){
            if(a<0){
                a=a*-1;
            }
            if(evenCheck(a)){
               counter++;
            }
        }
        return counter;
    }

    static boolean evenCheck(int element){
        if(element==0)
            return false;
        int digits =0;
        while(element>0){
            digits++;
            element=element/10;
        }
        return digits%2==0;
    }
}
