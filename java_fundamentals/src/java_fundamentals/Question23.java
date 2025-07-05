package java_fundamentals;
import java.util.*;
public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			sc.nextLine();
			int target=sc.nextInt();
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				
			}
			boolean found=false;
			int k=-1;
			for(int i=0;i<n;i++) {
				if(arr[i]==target) {
					found=true;
					k=i;
				}
				
			}
			if(found) {
				System.out.println(k);
			}
			else {
				System.out.println(k);
			}
	}

}
