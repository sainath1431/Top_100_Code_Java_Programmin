package com.sainath;

import java.util.Scanner;

public class Prob20_HarshadNumber {
    /*
    Harshad Number : It is an integer completely divisible by sum of its digits.

    for Example :
                    18 - 1 + 8 --> 9  (18 % 9 == 0)
                    12 - 1 + 2 --> 3  (12 % 3 == 0)
                    20 - 2 + 0 --> 2  (20 % 2 == 0)
                    153 - 1 + 5 + 3 --> 9   (153 % 9 == 0)
                    4991 - 4 + 9 + 9 + 1 ---> 23 (4991 % 23 == 0)
                    etc.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = in.nextInt();
        int n = num;
        int sum = 0;
        int last ;

        // To calculate the sum of all digits in a given number

        while( n != 0){
            last = n % 10;
            sum += last;
            n /= 10;
        }

        //check sum of digits of given number is completely divide to given number or not.

        if( num % sum == 0 ){
            System.out.println("Harshad Number.");
        }else{
            System.out.println("Not Harshad Number.");
        }
    }
}
