package exception;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int ind=sc.nextInt();
			System.out.println(arr[ind]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
	}

}
