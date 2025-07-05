package java_fundamentals;
import java.util.*;
public class Question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] ans=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int low=0;
		int high=n-1;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				ans[low]=arr[i];
				low++;
			}
			else {
				ans[high]=arr[i];
				high--;
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}
