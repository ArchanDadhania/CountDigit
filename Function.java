package com.company;

import java.util.Scanner;

public class Main {


    static int countDigit(int number)
    {

        int count = 0;
        while (number!=0)
        {
            number/=10;
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number: ");
        int number = sc.nextInt();

        System.out.println("Total number of digits;" +countDigit(number));

    }
}
