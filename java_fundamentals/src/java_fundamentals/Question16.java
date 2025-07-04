package java_fundamentals;
import java.util.*;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		for(int i=10;i<=99;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	 static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }


}
