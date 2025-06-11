import java.util.*;
class Week1_LR{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter L : ");
        int L = sc.nextInt();
        System.out.println("Enter R : ");
        int R = sc.nextInt();
        
        int sumCounter = 0;
        for (int i=L;i<=R;i++ ){
            sumCounter=sumCounter+i;
        }
        System.out.println(sumCounter);
        sc.close();
    }
}