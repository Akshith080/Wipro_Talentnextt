package exception;
import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter name of strudent1");
			String s1=sc.nextLine();
			int sum1=0;
			float avg1=0.0f;
			int[] marks=new int[3];
			for(int i=0;i<3;i++) {
				marks[i]=sc.nextInt();
				if(marks[i]<0) {
					throw new NegativeNumberException("Marks should be in range 0-100");
				}
				sum1+=marks[i];
			}
			avg1=sum1/3;
			System.out.println("Enter name of student2");
			sc.nextLine();
			String s2=sc.nextLine();
			int sum2=0;
			float avg2=0.0f;
			int[] m=new int[3];
			for(int i=0;i<3;i++) {
				m[i]=sc.nextInt();
				if(m[i]<0) {
					throw new NegativeNumberException("Marks should be in range 0-100");
				}
				sum2+=m[i];
			}
		
		avg2=sum2/3;
		  System.out.println("Average of Marks of Student 1 : " + avg1);
          System.out.println("Average of Marks of Student 2 : " + avg2);
	}
		catch(NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println(e.getClass().getName());
		}
		catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }

}}
class NegativeNumberException extends Exception{
	public NegativeNumberException(String str) {
		super(str);
	}
}