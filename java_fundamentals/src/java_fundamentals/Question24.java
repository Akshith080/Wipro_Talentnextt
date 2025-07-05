package java_fundamentals;
import java.util.*;
public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int value:arr) {
			System.out.print((char)value+" ");
		}
	}

}
