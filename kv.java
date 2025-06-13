public class kv {
    public static void main(String[] args) {
        int n = 64;
        int rem = 0;
        while (n>0){
            rem = n%2;
            n = n/2;
        }
        if (rem == 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}