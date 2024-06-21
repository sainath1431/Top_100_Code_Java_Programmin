package com.sainath;

import java.util.Scanner;

public class Prob21_AbundantNumber {
    /*
    Abundant Number : It is an integer whose sum of factor is greater than the number itself and not include the number itself in factors.

    Examples : 18 ,20, 24, 30, 36, 40, 54.

    i) number = 18 --> factors of 18 : 1,2,3,6,9  sum of factors = 1+2+3+6+9 = 21
                                                  sum of factors > number ===> number is an abundant number.
                                                  21 > 18 ===> 18 is an abundant number.

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = in.nextInt();

        boolean answer = abundantNumber(number);
        System.out.print(answer);

        /* To display abundant number from 1 to 100
        for(int i = 1; i<=100 ; i++){
            if(abundantNumber(i)){
                System.out.print(i + " ");
            }
        }
         */
    }

    static boolean abundantNumber(int num){
        int sum = 0;
        for(int i = 1 ; i < num ; i++){
            if( num % i == 0){
                sum += i;
            }
        }
        /*
        if(sum > num){
            return true;
        }

        return false;
         */

        //shortcut for above commented code.

        return sum > num;
    }
}
