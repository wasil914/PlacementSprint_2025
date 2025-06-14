import java.util.Scanner;
class Week2_Squarepattern{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();

        for(int o=0;o<(N);o++){
            System.out.println("O is" + o +" "+ "N is " + N);
            for(int i=0;i<N;i++){
                System.out.print("*");

            }
                    System.out.println();

        }
    }
}