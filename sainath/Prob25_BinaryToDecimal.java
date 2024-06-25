package com.sainath;

import java.util.Scanner;

public class Prob25_BinaryToDecimal {
    /*
    Logic : Calculate Decimal No. from Binary Number by Multiplying every digit of binary number with 2 to the power starting
            from 0 to n - 1.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The Binary Number : ");
        int binNum = scan.nextInt();

        int answer = binaryToDecimalConversion(binNum);
        System.out.print("The Decimal Number is : " + answer);




    }

    static int   binaryToDecimalConversion(int Binary){
        int Decimal = 0;
        int n = 0;
        while (Binary > 0){
            int temp = Binary % 10;
            Decimal += temp * Math.pow(2,n);
            Binary /= 10;
            n++;
        }
        return Decimal;
    }
}
