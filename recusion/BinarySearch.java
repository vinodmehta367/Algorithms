package com.kunalkushwaha.recusion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr= {2,4,7,10,11,14,19,23};
        int target=14;
        int start =0;
        int end= arr.length -1;
        int index=binarySearch(arr,start,end,target);
        System.out.println("The element is found at: "+ index);
    }
    static int binarySearch(int[] array,int start,int end,int num){
        int mid= (start+end)/2;
        if(start>end){
            return -1;
        }else if(array[mid]>num){
            end=mid-1;
        }else if(array[mid]<num){
            start=mid+1;
        }else if(array[mid]==num){
            return mid;
        }
        return binarySearch(array,start,end,num);
    }
}
