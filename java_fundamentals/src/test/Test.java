package test;
import com.automobile.FourWheeler.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logan l=new Logan();
		Ford f=new Ford();
		System.out.println(l.speed());
		System.out.println(l.gps());
		System.out.println(l.getModelName());
		System.out.println(l.getOwnerName());
		System.out.println(l.getRegistrationNumber());
	}

}
