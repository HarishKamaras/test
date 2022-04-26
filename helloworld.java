package com.bridgelabz;

public class helloworld {
    static String str = "Bridgelabz"; // null

   // static Sample2 emp1; // null
    static int[] arr = new int[3]; // null // size of array is 3
    static float[] floatArr = new float[5];
    static int i =10 ; // 0 // limit // 4 bytes
    static long l = 13; // 0 // 8 bytes
    static float f = 0.1f; // 0.0f // 4 bytes
    static double d = 0.5; // 0.0 // 8 bytes
    static byte b = 4; // 0 // -128 to 127 // 1 byte
    static short s = 8; // 0 // 2 bytes
    static char c = 'B'; // '\u0000' // 2 bytes
    static boolean b1 = true; // false // 1 bit

    // Method implementation
    static int m1(int a,int b){
        int x = 10;
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println("this is method m1()");
        int sum = a+b;
        return sum;
    }

    static void methodSample1(){
// System.out.println(x);
        System.out.println("this is method methodSample1()");
    }

    public static void main(String[] args) {
        System.out.println("harish");
        int sum = m1(1,3); // Method call
        System.out.println("sum :"+sum);
        methodSample1();
        System.out.println("Hello world");
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(b1);
        System.out.println(str);
        str = "bridge";
        System.out.println(str);

    }
}

