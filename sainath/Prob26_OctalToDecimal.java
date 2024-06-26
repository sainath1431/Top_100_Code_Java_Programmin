package com.sainath;

import java.util.Scanner;

public class Prob26_OctalToDecimal {
        /*
        Conversion Of Octal to Decimal By multiplying each digit in the Octal no. with the 8 to the power of 0 to n-1.
        where n is the number of digits in Octal Number.

        Octal No. :- Base is 8
        Decimal No. :- Base is 10
        Binary No. :- Base is 2

         */

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.print("Enter Octal Number (0-7) : ");
        int Octal = scan.nextInt();

        int answer = octalToDecimalConversion(Octal);
        System.out.print("The Decimal Number (0-10 : " + answer);



    }

    static int octalToDecimalConversion(int Octal){
        int Decimal = 0;
        int n = 0;
        while(Octal > 0){
            int temp = Octal % 10;
            Decimal += temp * Math.pow(8 , n);
            Octal /= 10;
            n++;
        }

        return Decimal;
    }
}

/*
TestCase 1 : Enter Octal Number (0-7) : 345
             The Decimal Number (0-10 : 229

TestCase 2 : Enter Octal Number (0-7) : 14
             The Decimal Number (0-10 : 12
 */
