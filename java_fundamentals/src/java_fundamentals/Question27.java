package java_fundamentals;
import java.util.*;
public class Question27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		ArrayList<Integer> li=new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int a:arr) {
			if(!li.contains(a)) {
				li.add(a);
			}
		}
		for(int a: li) {
			System.out.print(a+" ");
		}
	}

}
