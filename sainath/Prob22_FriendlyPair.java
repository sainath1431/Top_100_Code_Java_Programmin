package com.sainath;

import java.util.Scanner;

public class Prob22_FriendlyPair {
    /*
    Friendly Pair : friendly pair are two numbers with a common abundancy index, the ration between the sum of divisors of
                    a number and the number itself i.e. ?(n)/n where ?(n)--> sum of divisors of n and  n -->itself n.

                    so, two numbers are n and m are friendly pair numbers if ?(n)/n = ?(m)/m .

                    for example Input n = 6 , m = 28
                                Divisors of 6 ---> 1,2,3,6  ?(n) = 12 ---> sum of divisors of n
                                Divisors of 28 ---> 1,2,4,7,28  ?(m) = 56 ---> sum of divisors of m
                                Abundancy Index of 6 ===> ?(6)/6 == 12/6 = 2
                                Abundancy Index of 28 ===> ?(28)/28 == 56/28 = 2

                                because, abundancy index of 6 and 28 are common. so that 6 & 28 are Friendly Pair No's.

     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int n = in.nextInt();

        System.out.print("Enter Second Number : ");
        int m = in.nextInt();

        if(friendlyPair(n,m)){
            System.out.print(n + " " + m +" are Friendly Pair.");
        }else {
            System.out.print(n + " " + m +" are Not Friendly Pair.");
        }

    }

    static int sumOfDivisor(int num){
        int sum = 0;
        for(int i = 1 ; i <= num ; i++){
            if(num % i == 0){
                sum += i;
            }
        }

        return sum;
    }

    static boolean friendlyPair( int num1, int num2){
        int abundancyIndex_num1 = sumOfDivisor(num1) / num1;
        int abundancyIndex_num2 = sumOfDivisor(num2) / num2;

//        if(abundancyIndex_n == abundancyIndex_m){
//            return true;
//        }

        return false;
    }
}
