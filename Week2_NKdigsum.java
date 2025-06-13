import java.util.Scanner;

public class Week2_NKdigsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = sc.nextInt();
        System.out.println("Enter K: ");
        int K = sc.nextInt();

        int counter = 0, num = 1;
        while (counter < N) {
            int sum = 0;
            // Calculate the sum of digits of 'num'
            for (int i = num; i > 0; i /= 10) {
                sum += i % 10;
            }
            if (sum == K) {
                System.out.println(num);
                counter++;
            }
            num++;
        }
    }
}
