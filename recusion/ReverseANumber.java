package com.kunalkushwaha.recusion;

public class ReverseANumber {
    public static void main(String[] args) {
        int num=123456;
        reverseTheNumber(num);
    }
    static void reverseTheNumber(int num){
        if (num==0){
            return;
        }
        System.out.print(num%10);
        reverseTheNumber(num/10);
    }
}
