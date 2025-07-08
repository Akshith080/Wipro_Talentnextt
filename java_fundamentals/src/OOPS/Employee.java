package OOPS;
import OOPS.Person;
class Employee extends Person{
		
	private double salary;
	private int yearofjoin;
	private String NIC;
	public Employee(String name,double salary,int yearofjoin,String NIC) {
		super(name);
		this.salary=salary;
		this.yearofjoin=yearofjoin;
		this.NIC=NIC;
	}
	public String getname() {
		return super.name;
	}
	public double getsalary() {
		return salary;
	}
	public int getyearofjoin() {
		return yearofjoin;
	}
	public String getNIC() {
		return NIC;
	}

}
