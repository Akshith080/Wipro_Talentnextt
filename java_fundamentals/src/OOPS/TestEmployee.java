package OOPS;
import OOPS.Employee;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("akshith",100000.0,2025,"123-903");
		System.out.println(e.getname());
		System.out.println(e.getsalary());
		System.out.println(e.getyearofjoin());
		System.out.println(e.getNIC());
	}

}
