//Swap two numbers (with temporary variable)

public class ps4 {
    public static void main(String[] args){
        int num1=23;
        int num2=87;
        int tempVar;

            System.out.println("Before swapping : num1 = " + num1 + " num2 = "+num2);
        tempVar = num1;
        num1 = num2;
        num2 = tempVar;

            System.out.println("After swapping : num1 = " + num1 + " num2 = "+num2);
    }
    
}

