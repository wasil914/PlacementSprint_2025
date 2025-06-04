// //import java.util.*;
// import java.util.Scanner;
// class Week1_Practice1{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         String A = input.nextLine();
//         System.out.println(A);
//     }
// }
import java.util.Scanner;

class Week1_Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // byte
        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();

        // short
        System.out.print("Enter a short value: ");
        short s = sc.nextShort();

        // int
        System.out.print("Enter an int value: ");
        int i = sc.nextInt();

        // long
        System.out.print("Enter a long value: ");
        long l = sc.nextLong();

        // float
        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();

        // double
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        // char
        System.out.print("Enter a char value: ");
        char c = sc.next().charAt(0);

        // boolean
        System.out.print("Enter a boolean value (true/false): ");
        boolean bool = sc.nextBoolean();

        // Display all values
        System.out.println("\nYou entered:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        sc.close();
    }
}
