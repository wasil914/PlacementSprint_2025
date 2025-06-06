import java.util.Scanner;

public class ArmstrongNumberCheck {
    // Method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to check if a number is Armstrong
    public static boolean isArmstrong(int number) {
        int digits = countDigits(number);
        int originalNumber = number;
        int sum = 0;
        while (number != 0) {
            int remainder = number % 10;
            sum += Math.pow(remainder, digits);
            number /= 10;
        }
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
        scanner.close();
    }
}
