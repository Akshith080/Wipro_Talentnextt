package OOPS;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator(2,3);
		
		
	}
static void hell() {
	System.out.println("hello world");
}

}
class Calculator{
	public Calculator(int num1,int num2) {
		powerInt(num1,num2);
		powerDouble(num1,num2);
	}
	static void powerInt(int num1,int num2) {
		int ans=(int)Math.pow(num1, num2);
		System.out.println(ans);
	}
	static void powerDouble(double num1,int num2) {
		double ans=Math.pow(num1, num2);
		System.out.println(ans);
	}
	
}
