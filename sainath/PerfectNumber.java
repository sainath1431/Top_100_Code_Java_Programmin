package com.sainath;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = in.nextInt();

        System.out.println(perfectNumber(number));

    }

    static boolean perfectNumber(int num){

        int sum = 0;
        int temp = num;
        for(int i = 1; i < num ; i++){
            if(num % i == 0){
                sum += i;
            }
        }

//        if(sum == num){
//            return true;
//        }
//        else {
//            return false;
//        }

        return sum == num;

    }


}
