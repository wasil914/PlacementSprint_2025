import java.util.*;
class javakacode {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
        int n;
       for( n=N;n%2==0 && n>0;n=n/2);
       if(n==1)
       System.out.println("True");
       else
        System.out.println("False");

    }
}  