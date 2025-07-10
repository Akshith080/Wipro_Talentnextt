package interfaces;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=(a,b,c)->a+b+c;
		Test t2=(a,b,c)->a*b*c;
		System.out.println(t1.myFunction(2,3,4));
		System.out.println(t2.myFunction(2,3,4));
	}

}
interface Test{
	int myFunction(int x,int y,int z);
}
