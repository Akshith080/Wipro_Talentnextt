package abstraction;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] compartment=new Compartment[10];
		Random r=new Random();
		for(int i=0;i<compartment.length;i++) {
			int choice=r.nextInt(4)+1;
			switch(choice) {
			case 1:
				compartment[i]=new Luggage();
				break;
			case 2:
				compartment[i]=new Ladies();
				break;
			case 3:
				compartment[i]=new General();
				break;
			case 4:
				compartment[i]=new FirstClass();
				break;
			}
		}
		System.out.println("Comparment Notices: ");
		for(Compartment comp:compartment) {
			System.out.println(comp.notice());
		}
	}

}
abstract class Compartment{
	public abstract String notice();
}
class FirstClass extends Compartment{
	@Override
	public String notice() {
		return "FirstClass Compartment";
	}
}
class Ladies extends Compartment{
	@Override
	public String notice() {
		return "Ladies Compartment";
	}
}
class General extends Compartment{
	@Override
	public String notice() {
		return "General Compartment";
	}
}
class Luggage extends Compartment{
	public String notice() {
		return "Luggage Compartment";
	}
}