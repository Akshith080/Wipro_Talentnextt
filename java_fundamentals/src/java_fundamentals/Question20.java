package java_fundamentals;

import java.util.*;
public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=n;
		int sum=0;
		while(r>0) {
			int rem=r%10;
			sum=sum*10+rem;
			r/=10;
		}
		if(sum==n) {
			System.out.println(n+" is a palindrome");
		}
		else {
			System.out.println(n+" is not a palindrome");
		}
	}

}
