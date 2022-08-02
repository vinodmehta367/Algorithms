package com.kunalkushwaha.sortingalgo;

public class BubleSort {

    public static void main(String[] args) {
        int[] arr ={5,14,3,6,12,11,8,10};
        int temp=0,j=0;
        while(j< arr.length) {
            for (int i = 0; i < arr.length - j-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            j++;
        }
    for(int a:arr){
        System.out.print(a+"->");
    }
    }
}
