import java.util.Scanner;
class Week1_TernaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Marks ");
        int marks = sc.nextInt();

        String Result = marks>=33 ? "Pass" : "Fail" ;
        System.out.println("Result: " + Result);
    
    }
}
