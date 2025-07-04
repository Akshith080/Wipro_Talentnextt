package java_fundamentals;

import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.nextLine().charAt(0);
		if(ch>='a' && ch<='z') {
			ch= (char)(ch-32);
			System.out.println(ch);
		}
		else {
			ch=(char)(ch+32);
			System.out.println(ch);
		}
	}

}
