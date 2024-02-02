import java.io.InputStream;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
//        To give a input to our console we use Scanner & have to make it's obj.

//        in this we will take a integer input
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your age");
//        int age = scan.nextInt();
//        System.out.println("Age is: "+ age);

//        here we ll take a string input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any name");
//        String name = sc.nextLine();   //we use nextLine() to read full sentence.
//        System.out.println("Your given name > "+ name);


//        adding two numbers
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("first number");
//        int num1 = sc.nextInt();
//
//        System.out.println("Second number");
//        int num2 = sc.nextInt();
//
//        int sum = num1 + num2;
//
//        System.out.println("Sum of two nums: " + sum);

//        SIMPLE INTEREST

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter principle amount: ");
        float p = scan.nextFloat();

        System.out.println("Enter rate of interest: ");
        float i = scan.nextFloat();

        System.out.println("Enter time period: ");
        float t = scan.nextFloat();

        float si = (p * i * t)/100;

        System.out.println("Principle " + p);
        System.out.println("Rate of Interest " + i);
        System.out.println("Time period " + t);

        System.out.println("Your total Simple Interest " + si);
    }
}
