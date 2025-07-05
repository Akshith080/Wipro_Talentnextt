package java_fundamentals;
import java.util.*;
public class Question32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a1=new int[3];
		int[] a2=new int[3];
		int[] res=new int[2];
		for(int i=0;i<3;i++) {
			a1[i]=sc.nextInt();
			a2[i]=sc.nextInt();
		}
		res[0]=a1[3/2];
		res[1]=a2[3/2];
		System.out.println(Arrays.toString(res)+3/2);
	}

}
