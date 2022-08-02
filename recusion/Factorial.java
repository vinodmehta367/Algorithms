package com.kunalkushwaha.recusion;

public class Factorial {
    public static void main(String[] args) {

        int numbr=5;
        int result=factorial(numbr);
        System.out.println("The factorial of "+numbr +" is : "+result);
    }
    static int factorial(int num){
        if (num==1){
            return 1;
        }

        return num*factorial(num-1) ;
    }
}
