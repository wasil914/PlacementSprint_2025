import java.util.*;
class Week1_dangerno{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int dnum =sc.nextInt();

        for (int i=1 ; i<=n ;i++ ){
            System.out.println(i);
            if(i==dnum){
                break;
            }
        }
    }
}