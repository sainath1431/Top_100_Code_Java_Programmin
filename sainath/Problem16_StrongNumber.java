package com.sainath;

import java.util.Scanner;

public class Problem16_StrongNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int number = in.nextInt();

        boolean res = strongNumber(number);
        System.out.println(res);
    }

    static boolean strongNumber(int num){
        int fact;
        int given = num;
        int sum = 0;


        while(num != 0){
            fact = 1;
            int n = num % 10;
            int i =1;
            while(i <= n){
                fact *= i;
                i++;
            }
            sum += fact;

            num = num / 10;
        }

        return sum == given;
    }
}
