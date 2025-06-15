
import java.util.*;
public class Week2_OptimisedPrimeChecker {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();
        boolean isPrime = true;

        if(N<=1){
            isPrime = false ;
        }
        else{
            for(int i=2;i<(Math.sqrt(N));i++){
                if(N%i==0)
                isPrime=false;
            }
        }
        System.out.println(isPrime);
        sc.close();
    }
}