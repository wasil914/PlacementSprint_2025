import java.util.*;
class Week1_Watermelon{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int watermelon = sc.nextInt();

        if(watermelon>2 && watermelon%2==0)
        System.out.println("YES");
        else
        System.out.println("NO");
        sc.close();
    }
}