package java_fundamentals;
import java.util.*;
public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] mat= new int[2][2];
		int[][] res=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		int rows=mat.length;
		int cols=mat[0].length;
		 for (int i = 0; i < rows / 2; i++) {
	            int[] temp = mat[i];
	            mat[i] = mat[rows - 1 - i];
	            mat[rows - 1 - i] = temp;
	        }
		 for (int i = 0; i < rows; i++) {
	            int start = 0, end = cols - 1;
	            while (start < end) {
	                int temp = mat[i][start];
	                mat[i][start] = mat[i][end];
	                mat[i][end] = temp;
	                start++;
	                end--;
	            }
	        }

		 System.out.println(Arrays.deepToString(mat));
	}

}
