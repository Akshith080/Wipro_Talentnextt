package exception;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			String[] ip=sc.nextLine().split(",");
			UserRegistration user=new UserRegistration();
			user.registerUser(ip[0],ip[1]);
		}
		finally {
			sc.close();
		}
	}

}
class InvalidCountryException extends Exception{
	public InvalidCountryException(String string) {
		super(string);
	}
}
class UserRegistration{
	void registerUser(String username,String userCountry) {
		try {
			if(userCountry.equals("India")) {
				System.out.println("User registration done sucessfully");
			}
			else {
				throw new InvalidCountryException("User outside India");
			}
		}
		catch(InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getClass().getSimpleName());
		}
	}
}