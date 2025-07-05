package java_fundamentals;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int maxi=Integer.MIN_VALUE;
		 int max2=Integer.MIN_VALUE;
		 int mini=Integer.MAX_VALUE;
		 int min2=Integer.MAX_VALUE;
		 int[] arr=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 for(int val:arr) {
			 if(val>maxi) {
				 max2=maxi;
				 maxi=val;
			 }
			 else if(val>max2 && val!=maxi) {
				 max2=val;
			 }
			  if (val < mini) {
	                min2 = mini;
	                mini = val;
	            } else if (val < min2 && val != mini) {
	                min2 = val;
	            }

		 }
		 System.out.println("maximum values "+maxi+" "+max2);
		 System.out.println("minimum values "+mini+" "+min2);	
		 }

}
