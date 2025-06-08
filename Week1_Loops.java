import java.util.Scanner;
class Week1_Loops{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the marks obtained : ");
        int marks = sc.nextInt();
        if(marks>=33){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        System.out.println("Test");
        sc.close();
    }
}