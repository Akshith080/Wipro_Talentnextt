package exception;
import java.util.*;
public class Question2 {

	public static void main(String[] args) throws NumberFormatException, ArithmeticException {
        if (args.length != 5) {
            throw new IllegalArgumentException("Please enter exactly 5 integers.");
        }

        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]); // throws NumberFormatException
            sum += arr[i];
        }

        double average = sum / arr.length; // could throw ArithmeticException if length is 0

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }


}
