package wrapperclasses;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee original = new Employee("Sai", 101, 50000.0);
        Employee clone=original.clone();
        original.setName("Ravi");
        original.setId(102);
        original.setSalary(60000.0);
        System.out.println("Original: " + original);
        System.out.println("Clone:    " + clone);


	}

}
class Employee implements Cloneable {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    
    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
    public void setSalary(double salary) { this.salary = salary; }
    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    @Override
    public String toString() {
        return String.format("Employee [Name=%s, ID=%d, Salary=%.2f]", name, id, salary);
    }

    
}

