//Find the maximum of two numbers
import java.util.Scanner;
class Week2_ps1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :  ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number :  ");
        int num2 = sc.nextInt();
    
    if(num1>=num2)
    System.out.println("Maximum number is : "+ num1);
    else
        System.out.println("Maximum number is : "+ num2);

        sc.close();
    }
}
    //Ternary operator

    // int r = num1>=num2 ?  num1 : num2 ;

    // System.out.println(r);