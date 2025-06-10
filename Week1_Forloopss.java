import java.util.*;
 class Week1_Forloopss{
    public static void main(String[] args){
        System.out.println("Enter N : ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        for (int i=2 ;  i<=n  ; i+=2){
            if(i%7==0){
                System.out.println(i);
            }
        }
        
    }
 }