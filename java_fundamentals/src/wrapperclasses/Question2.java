package wrapperclasses;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Given Number: "+n);
		System.out.println("Binary equivalent: "+Integer.toBinaryString(n));
		System.out.println("Octal equivalent: "+Integer.toOctalString(n));
		System.out.println("Hexadecimal equivalent: "+Integer.toHexString(n));
	}

}
