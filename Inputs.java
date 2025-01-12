package com.shashwat;
import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.in is something that we provided to the input
        //and the object of that input will take the input from the keyboard
//        System.out.print("please enter some input : ");
//        int rollNo = input.nextInt();
//        System.out.println("Your roll no is "+ rollNo);

       // int a = 19;
        //here 19 is the object is called literal
        //here 'a' is the reference variable , and it is called the Identifier.
        //Identifier is the name of the method,class,packages,variable,interfaces
      //  int b = 234_000_000;

//        System.out.print("Enter your marks : ");
//        float marks = input.nextFloat();
//        System.out.println(marks);



//        System.out.print("Enter your name : ");
//        String name = input.nextLine();
//        System.out.println("Your name is " +name);

        boolean num = input.hasNextInt();
        System.out.println(num);


    }
}
