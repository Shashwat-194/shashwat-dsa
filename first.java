package com.shashwat;
import java.util.Scanner;
public class first {
    public static void main(String[]args){
        //String[]args is a command line argument
        //static is used because we want to  run the main function without creating the object of the class firstj
        System.out.println("Hekki");
        Scanner sc = new Scanner(System.in);
        //System.in==>>standard keyboard input
        //new is used to create an object
        //scanner is a class that allows us to take input
        //using variable of that class we can take the input
        System.out.println(sc.nextInt());
        System.out.println(sc.next());//takes an input in string
        System.out.println(sc.nextLine());//takes an input string in line



    }

}
