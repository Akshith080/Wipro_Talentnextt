package java_fundamentals;
import java.util.*;
public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean skip=false;
		int sum=0;
		for(int i=0;i<n;i++) {
			int a=arr[i];
			if(a==6 && i!=n-1) {
				skip=true;
				continue;
			}
			if(skip) {
				if(a==7) {
					skip=false;
				}
				continue;
			}
			
			sum+=a;
			
		}
		System.out.println(sum);
	}

}
