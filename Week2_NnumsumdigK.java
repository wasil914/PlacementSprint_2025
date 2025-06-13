import java.util.*;
public class Week2_NnumsumdigK {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter N : ");
        int N = sc.nextInt();
        System.out.println("Enter K : ");
        int K = sc.nextInt();

        int sum=0;
        int i;
        for(i=1; ;i++){
            for(int n=i; ;n=n/10){
                sum=sum+ (i%10);

                 if(sum==K){
                    System.out.println(i);
                 }
                
             
            }
        }
            
            
        











    }
}
