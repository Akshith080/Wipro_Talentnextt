package java_fundamentals;
import java.util.*;
public class Question31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean flag=false;
		for(int a:arr) {
			if(a==1 || a==4) {
				flag=true;
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
