import java.util.*;
class Week1_Numberofdigits{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("To calculate number of digits , Enter Number N = ");
        int N = sc.nextInt();

        int digitCounter=0;
        for(int num = N ;num >0;num/=10){
            digitCounter+=1;
        }
        System.out.println(digitCounter);
        sc.close();
    }
}