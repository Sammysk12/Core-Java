package Variables_in_java;

import java.util.*;
public class Variables_in_Java {
    public static void main(String[] args) {

        System.out.println("Hello World");

        //Variables
        int a = 25;
        int b = 10;

        int sum = a+b;
        System.out.println(sum);

        String name = "Tony Stark";
        //Datatype   Variable name  =  "Value";
        int age = 22;
        double price =45.34;


        //Scanner class
        //Special class in  java.util package to take input in java

        //Scanner object created using scanner class
        Scanner sc = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter your Name: ");
        String inpName = sc.nextLine();

        System.out.println("Hello "+ inpName);



    } //end main
}// end class
// This Entire code is called as boiler plate code means basic code for start java code
