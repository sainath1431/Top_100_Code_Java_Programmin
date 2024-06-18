package com.sainath;

import java.util.Scanner;

public class prob18_PerfectSquare {
    /*
        Perfect Square : numbers that are the products of integers by themselves.
        num * num = num square (perfect square)
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = in.nextInt();

        if(perfectSquare(number)) {
            System.out.println("It Is a Perfect Square.");
        }else{
            System.out.println("It Is not.");
        }
    }

    public static boolean perfectSquare(int num){

        //To check the Perfect Square or not the given number.
        for (int i = 1; i * i <= num ; i++) {
            if(i * i == num){
                return true;
            }
        }

        return false;
    }
}
