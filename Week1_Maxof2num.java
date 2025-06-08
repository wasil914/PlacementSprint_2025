import java.util.Scanner;

class Week1_MaxOf2num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 and num2:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2)
            System.out.println("Maximum = " + num1);
        else if (num1 < num2)
            System.out.println("Maximum = " + num2);
        else
            System.out.println("Both no.s are equal => Maximum = " + num1);

        sc.close();
    }
}
