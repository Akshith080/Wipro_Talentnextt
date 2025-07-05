package java_fundamentals;
import java.util.*;
public class Question34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][3];
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(arr[i][j]>maxi) {
					maxi=arr[i][j];
				}
			}
		}
		System.out.println("The biggest number in the given array is "+maxi);
	} 

}
