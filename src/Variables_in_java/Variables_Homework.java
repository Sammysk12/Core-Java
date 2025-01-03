package Variables_in_java;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Variables_Homework {
    public static void main(String[] args) {


        // Q.1
        // Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.

        char ch = 'A';
        int age = 22;
        float aggrigate = 76.60F;
        double price = 33.40;
        long phoneNumber = 81484339;
        short num = 3;
        byte b = 2;
        boolean guess = false;

        //Q.2
        //Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Radius: ");
//        double rad = sc.nextDouble();
//
//        double area = 2*(22/7)*(rad*rad);
//
//        System.out.println("THe area of the circle is "+ area);

        //Q.3
        //Make a program that prints the table of a number that is input by the user.

        System.out.print("Enter number: ");
        int num1 = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(num1+" X "+ i+" = "+ num1*i);
        }


    }
}
