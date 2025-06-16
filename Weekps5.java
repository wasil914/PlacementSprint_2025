//Swap two numbers (with temporary variable)

public class Weekps5 {
    

    public static void main(String[] args){
        int num1=23;
        int num2=87;

            System.out.println("Before swapping : num1 = " + num1 + " num2 = "+num2);
        num1 = num1 + num2 ;
        num2 = num1 - num2 ;
        num1 = num1 - num2 ;
            System.out.println("After swapping : num1 = " + num1 + " num2 = "+num2);
    }
    
}



//Swap two numbers (without temporary variable) a=12 b=6
//a=a+b 18
//b=a-b 12
//a=a-b 6