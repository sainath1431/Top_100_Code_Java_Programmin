package com.sainath;

import java.util.Scanner;

public class Prob24_LCM {
    /*
    LCM (Least Common Multiple) : - LCM is the method to find the smallest possible multiple of two or more numbers.

    Example :  2 | 6  15
               3 | 3  15
               5 | 1  5
                 | 1  1

              LCM ( 6 , 15 ) = 2 X 3 X 5 = 30.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int num1 = scan.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = scan.nextInt();

        int ans = leastCommonMultiple(num1 , num2);

        System.out.print("LCM of " + num1 + " & " + num2 + " = " + ans);

    }

    static int leastCommonMultiple(int num1 , int num2){

        int lcm = (num1 > num2) ? num1 : num2 ;

        while(true){
            if(lcm % num1 == 0 && lcm % num2 == 0){
                return lcm;
            }

            lcm ++;
        }
    }
}
