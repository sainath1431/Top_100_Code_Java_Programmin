package com.sainath;

import java.util.Scanner;

public class Problem12_Fibonacci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Take Input From User Which term Up to Want a Fibonacci Series.
        System.out.print("Enter the Term Up to Fibonacci Series Want (2nd to nth term) : ");
        int num = in.nextInt();

        fibonacciSeries(num);
    }

    static void fibonacciSeries(int num){
        int a = 0; //0th term of fibonacci series
        int b = 1; //1st term of fibonacci series
        int nextTerm; //it calculates the new term by adding its previous two terms.
        System.out.print(a + " " + b + " ");
        for( int i=2 ; i<num ; i++){
            nextTerm = a+b;
            a = b;
            b = nextTerm ;
            System.out.print(nextTerm + " ");
        }

    }


}
