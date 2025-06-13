import java.util.Scanner;

class Week2_WL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int N = sc.nextInt();
        System.out.print("Enter value of K: ");
        int K = sc.nextInt();

        int counter = 0;
        int num = 1;

        while (counter < N) {
            int sum = 0;
            for (int i = num; i > 0; i /= 10) {
                sum += i % 10;
            }
            if (sum == K) {
                System.out.println(num);
                counter++;
            }
            num++;
        }
        sc.close();
    }
}
