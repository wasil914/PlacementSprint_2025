//Find the maximum of two numbers
import java.util.Scanner;
class ps2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :  ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number :  ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd Number :  ");
        int num3 = sc.nextInt();
    
    if(num1>=num2 && num1>=num3)
        System.out.println("Maximum number is : "+ num1);
    else if(num2>=num1 && num2>=num3)
        System.out.println("Maximum number is : "+ num2);
    else 
        System.out.println("Maximum number is : "+ num3);

        sc.close();
    }
}