package com.kunalkushwaha.sortingalgo;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        int start=0;
        int end= arr.length-1;
        quicksort(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }

    static void quicksort(int[] array,int start,int end){
        if(start>=end){
            return;
        }
        int low=start;
        int hi=end;
        int mid= (hi + low)/2;
        int pivot=array[mid];


        while (low<=hi){
            while(array[low]<pivot){
                low++;
            }
            while(array[hi]>pivot){
                hi--;
            }
            if(low<=hi){
                int temp=array[hi];
                array[hi]=array[low];
                array[low]=temp;
                low++;
                hi--;
            }
        }
       quicksort(array,start,hi);
        quicksort(array,low,end);
    }
}
