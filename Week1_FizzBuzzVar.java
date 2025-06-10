import java.util.*;
class Week1_FizzBuzzVar{
    public static void main(String[] args){
         Scanner sc = new Scanner (System.in);
         int N = sc.nextInt();

         int sum = 0;

         for(int i=1;i<=N;++i){             //sum<2N && i<=N
            if(i%3==0 && i%5==0)
            System.out.println("FizzBuzz");
            else if (i%3==0)
            System.out.println("Fizz");
            else if (i%5==0)
            System.out.println("Buzz");
            else {
            System.out.println(i);
            sum += i;
            if(sum>2*N)
                break;//inside else also correct
            }
            //if(sum>2*N)
              //  break;
         }
    }
}