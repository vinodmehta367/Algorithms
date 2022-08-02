package com.kunalkushwaha.searching.binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,5,8,20,24,25,28,29,31,35,41,48,51};
        int searchElemnet =418;
        System.out.println(binarySearch(arr,searchElemnet));
    }

    static int binarySearch(int[] array,int target){
        int start =0;
        int end = array.length-1;

        while (start<=end) {
            int mid = (start+end)/2;
            if (array[mid] < target) {
                System.out.println("Sarching to right of mid");
                start = mid + 1;
            } else if (array[mid] > target) {
                System.out.println("Searching to left of mid");
                end = mid - 1;
            } else if (array[mid] == target) {
                System.out.println("Elemnet found " + array[mid]);
                return mid;
            }
        }
        return -1;
    }
}
