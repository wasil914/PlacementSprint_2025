import java.util.*;
public class Week2_SumofNisKusingwhileloop {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter K : ");
        int K = sc.nextInt();
        int sum = 0;
        int i=1;
        while(sum<K){
            System.out.println(i);

            sum=sum+i;
            i+=1;

        }
    }
}
