package java_fundamentals;
import java.util.*;
public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
//		int maxi=0;
//		int min=0;
//		for(int i=1;i<n;i++) {
//			if(arr[i]>maxi) {
//				maxi=arr[i];
//			}
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
		Arrays.sort(arr);
		int maxi=arr[n-1];
		int min=arr[0];
		
		System.out.println("Maximum value is "+ maxi);
		System.out.println("Minimum value is "+min);
	}

}
