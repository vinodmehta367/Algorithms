package com.kunalkushwaha.recusion;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 123456;
        System.out.println(sumOfDigits(number));
    }
    static int sumOfDigits(int num){
        if (num==0){
            return 0;
        }
        return num%10 + sumOfDigits(num/10);

    }
}
