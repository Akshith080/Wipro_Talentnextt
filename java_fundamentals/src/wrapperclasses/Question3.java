package wrapperclasses;
import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers between 1 to 255");
		int n=sc.nextInt();
		String binary=Integer.toBinaryString(n);
		String formatted = String.format("%8s", binary).replace(' ', '0');
		System.out.println(formatted);
	}

}
