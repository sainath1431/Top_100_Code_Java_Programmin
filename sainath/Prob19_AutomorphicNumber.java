package com.sainath;

import java.util.Scanner;

public class Prob19_AutomorphicNumber {
    /*
    Automorphic Number : The square of number it ends with original number are called as Automorphic number.

    for Example :
                    1) 5 -- > 25
                    ii) 25 ---> 625
                    iii) 6 ---> 36
                    iv) 376 ---> 141376
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = in.nextInt();
        int square  = number * number;
        int count = 0;
        int temp = number;

        //To count the digits in original no.
        while(temp > 0){
            count++;
            temp = temp / 10;
        }

        //To get ends digit of square to compare with original number.
        int lastDigit = (int)(square % Math.pow(10,count));

        if(lastDigit == number){
            System.out.println("Automorphic Number.");
        }else{
            System.out.println("Not Automorphic Number.");
        }

    }
}
