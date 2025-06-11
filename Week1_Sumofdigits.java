import java.util.Scanner;
class Week1_Sumofdigits{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter N : ");
        int N = sc.nextInt();

        int sumCounter=0;

        for(int num = N;num>0;num/=10){
            sumCounter+=num%10;
        }
        System.out.println(sumCounter);
        sc.close();

        
    }
}