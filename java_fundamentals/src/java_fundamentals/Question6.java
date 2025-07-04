package java_fundamentals;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.isEmpty()) {
			System.out.println("No Values");
		}
		else {
			String[] word=s.trim().split(" ");
			for(int i=0;i<word.length;i++) {
				System.out.print(word[i]);
			
				if(i<word.length-1) {
				System.out.print(", ");
			}
		}}
	}

}
