package exception;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			if(args.length!=2) {
				throw new InvalidNumberOfInputException("please enter exactly 2 values");
			}
			String name=args[0];
			int age=Integer.parseInt(args[1]);
			if(age<18 || age>=218) {
				throw new InvalidAgeException("Age should be between 18 and 217");
			}
		}
		catch(InvalidNumberOfInputException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		catch (NumberFormatException e) {
            System.out.println(e.getClass().getSimpleName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
	}

}
class InvalidAgeException extends Exception{
	InvalidAgeException(String str){
		super(str);
	}
}
class InvalidNumberOfInputException extends Exception{
	InvalidNumberOfInputException(String str){
		super(str);
	}
}