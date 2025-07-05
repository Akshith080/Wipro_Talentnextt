package java_fundamentals;
import java.util.*;
public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==10) {
				j=i;
				break;
			}
		}
		for(int i=j+1;i<n;i++) {
			if(arr[i]!=10 && arr[j]==10) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]==10) {
				arr[i]=0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
