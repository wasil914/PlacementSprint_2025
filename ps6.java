//Check if a number is positive, negative, or zero
import java.util.*;
class ps6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();

        if(N>0)
        System.out.println("Positive ");
        else if (N<0)
        System.out.println("Negative ");
        else
        System.out.println("Zero ");
        sc.close();
    }
}