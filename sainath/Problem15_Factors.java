package com.sainath;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem15_Factors {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number To Calculate The Factors of it : ");
        int num = in.nextInt();

        factorsOfNumber(num);


    }

    static void factorsOfNumber(int num ) {

        System.out.print("Factors of " + num + " Are ");

        // for loop is used to check the condition of factors for each number up to given number.
        for (int i = 1; i <= num; i++) {
            //condition to check the factor
            if (num % i == 0) {
                System.out.print(i + " ");
            }

        }
    }

}
