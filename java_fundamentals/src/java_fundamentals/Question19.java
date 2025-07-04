package java_fundamentals;

import java.util.*;
public class Question19 {

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
		System.out.println(sum);
	}

}
