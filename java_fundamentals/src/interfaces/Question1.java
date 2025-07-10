package interfaces;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
				c.message();
	}

}
interface Vehicle{
	default void message() {
		System.out.println("Inside vehicle");
	}
}
interface FourWheeler{
	default void message() {
		 System.out.println("Inside Four WHeeler");
	 }
}
class Car implements Vehicle,FourWheeler{
	@Override
	public void message() {
		Vehicle.super.message();
	}
	
}