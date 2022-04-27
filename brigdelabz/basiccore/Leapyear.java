package com.brigdelabz.basiccore;
import java.util.Scanner;

public class Leapyear {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the number : ");
        int num = s.nextInt();

        if (((num % 4 == 0) && (num % 100!= 0)) || (num%400 == 0))
            System.out.println("The year you enter is leap year" + num);
        else
            System.out.println("The year you enter is not a leap year " + num);
    }
}
