public class Week2_whileloop1 {
    public static void main(String[] args){
        int n=2;

        while(n%2==0 ){
            System.out.println(n);
            n=n+2;
            if(n>50){
                break;
            }
            
        }
    }
    
}
