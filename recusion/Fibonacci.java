package com.kunalkushwaha.recusion;

public class Fibonacci {
    public static void main(String[] args) {
        int num=4;
        System.out.println(findFibonacci(num)) ;

    }

    static int findFibonacci(int num){
        if (num<2){
            return num;
        }
        return findFibonacci(num-1)+ findFibonacci(num-2);
    }
}
