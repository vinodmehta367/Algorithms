package com.kunalkushwaha.sortingalgo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        System.out.println("Unsorted"+ Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("Sorted Array:"+ Arrays.toString(arr));
    }

    static void insertionSort(int[] array){
    for (int i=0;i< array.length-1;i++){
        for (int j=i+1;j>0;j--){
            if(array[j-1]>array[j]){
                int temp=array[j];
                array[j]=array[j-1];
                array[j-1]=temp;
            }else if(array[j]>array[j-1]){
                break;
            }
        }
    }
    }
}
