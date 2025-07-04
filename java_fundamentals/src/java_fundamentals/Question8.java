package java_fundamentals;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch=s.charAt(0);
		if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z')) {
			System.out.println("Alphabet");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}
	}

}
