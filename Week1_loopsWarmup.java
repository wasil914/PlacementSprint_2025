import java.util.*;
 class Week1_loopsWarmup{
    public static void main(String[] args){
        System.out.println("Enter N : ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for(int i =2  ; i<=n ; i=i+2){
            System.out.println(i);

        }
    }
 }