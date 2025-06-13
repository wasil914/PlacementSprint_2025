import java.util.*;
class Week2_SumofNisK {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter K : ");
		int K = sc.nextInt();

		int sum = 0;
		int i;
		for(i=1; ;i=i+1){
			sum=sum+i;
			System.out.println(i);
			if(sum==K)
				break;
			
		}
        sc.close();
	}
}