import java.util.Scanner;

public class BasicConceptsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input: name and age
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // User input: two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Output user info
        System.out.println("\nHello, " + name + "! You are " + age + " years old.");

        // Arithmetic operations
        System.out.println("\nArithmetic Operations:");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Even or odd
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even.");
        } else {
            System.out.println(num1 + " is odd.");
        }

        // Swap numbers
        System.out.println("\nBefore swapping: num1 = " + num1 + ", num2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        sc.close();
    }
}
 
