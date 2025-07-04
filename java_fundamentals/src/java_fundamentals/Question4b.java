package java_fundamentals;

import java.util.Scanner;

public class Question4b {
	static boolean result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		if(n1>0 && n2>0) {
		result=lastdigit(n1,n2);
		}
		System.out.println(result);
	}
	public static boolean lastdigit(int number1,int number2) {
		return number1%10==number2%10;
	}

}
