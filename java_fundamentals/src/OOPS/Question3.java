package OOPS;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Book b=new Book("Atomy fabice",new Author("kiran","venkatakiran42@gmail.com",'M'),4500,100);
			Book b1=new Book("Ramayanam",new Author("Valmiki","valmiki@gmail.com",'M'),5600,100);
			System.out.println(b.getname());
			System.out.println(b.getprice());
			System.out.println(b.getqty());
			System.out.println(b.getauthor().name+" "+b.getauthor().email+" "+b.getauthor().gender);
			System.out.println(b1.getname());
			System.out.println(b1.getprice());
			System.out.println(b1.getqty());
			System.out.println(b1.getauthor().name+" "+b1.getauthor().email+" "+b1.getauthor().gender);
	}

}
class Author{
	String name;
	String email;
	char gender;
	public Author(String name,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
}
class Book{
	private String name;
	private Author author;
	private double price;
	private int qty;
	public Book(String name,Author author,double price,int qty) {
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setprice(double price) {
		this.price=price;
	}
	public void setqty(int qty) {
		this.qty=qty;
	}
	public void setauthor(Author author) {
		this.author=author;
	}
	public String getname() {
		return name;
	}
	public double getprice() {
		return price;
	}
	public int getqty() {
		return qty;
	}
	public Author getauthor() {
		return author;
	}
}