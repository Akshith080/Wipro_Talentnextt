package java_fundamentals;
import java.util.*;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isPrime=true;
		if(n<=1) {
			isPrime=false;
		}
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				isPrime=false;
			}
		}
		if(isPrime) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
	}

}
