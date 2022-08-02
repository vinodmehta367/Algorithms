package com.kunalkushwaha.sortingalgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={11,10,8,6,5,2};
        //to sort this array in asc order
        for(int i=0;i< arr.length;i++){
        int start =0+i;
        int last =arr.length-1;
        int minIndex= findSmallestElementIndex(start,last,arr);
        swapElement(arr,start,minIndex);

        }
        System.out.println(Arrays.toString(arr));

    }
    static int findSmallestElementIndex(int start,int end,int[] array){
        int min = start;
        for(int i=start+1;i<=end;i++){
            if(array[i]<array[min]){
                min=i;
            }
        }
        return min;
    }
    static void swapElement(int[] arr,int from ,int to){
        int temp = arr[to];
            arr[to] = arr[from];
            arr[from] = temp;
        }
    }

