import java.util.*;
class Week1_ForLoopNto1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n;i>0;i--){
            System.out.println(i);
        }
    }
}