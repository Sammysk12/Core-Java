package Variables_in_java;
import java.util.Scanner;

public class Variables_exercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a= sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        int sum = a+b;

        System.out.println("The sum is "+sum);

    }
}
