package com.sainath;

import java.util.Scanner;

public class Prob23_HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = in.nextInt();

        System.out.print("Enter Second number : ");
        int num2 = in.nextInt();


        System.out.print(highestCommonFactor(num1 , num2));
    }

    static int highestCommonFactor(int num1 , int num2){
        int hcf = Integer.MIN_VALUE;
        for(int i = 1 ; i <= num1 || i <= num2 ; i++){
            if(num1%i==0 && num2%i==0){
                if(i>hcf){
                    hcf = i;
                }
            }
        }
        return hcf;
    }
}
