package com.shashwat;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //for type conversion destination type must be greater than the source type
        //explicit conversion is called the narrowing the conversion

//        int num1 = (int)(57.3f);
//        System.out.println(num1);

        //automatic type promotions in expressions

        //remainder of the maximum value
//        int a = 357;
//        byte b = (byte)(a); //257 % 256 = 1
//        System.out.println(b);

//        byte a = 30;
//        byte b = 33;
//        byte c = 33;
//        int d = (a * b) / c; //expression is performed with integer
//        System.out.println(d);

//        byte b = 33;
//        b = b * 2; //because 2 here is the integer


          int number = 'a';
        System.out.println(number);
        //java follows uniCode value
        //can print in other languages too


        //all the byte,short and char value are promoted to integers
        //if one operand is long  then whole expression will be converted to long
        //same for float  and double also

        //float + int - double = double(maximum one)

    }
}
