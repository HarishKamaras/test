package com.brigdelabz.basiccore;

public class Swaptwonumbers {
    public static void main(String[] args) {
        int first = 67;
        int second = 34;

        System.out.println("Before swap:");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        int temp = first;

        first = second;

        second = temp;

        System.out.println("After swap:");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
