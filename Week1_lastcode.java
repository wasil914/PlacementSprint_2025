import java.util.Scanner;
class Week1_lastcode{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int V;

        for(V=n;V>1 && V%2==0;V=V/2);
        
        if(V==1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}