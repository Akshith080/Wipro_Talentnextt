package java_fundamentals;
import java.util.*;
public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] empno= {1001,1002,1003,1004,1005,1006,1007};
	String[] EmpName= {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
	String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "01/01/2000", "12/06/2006"};
	  char[] desigCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
      String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
      int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
      int[] hra =   {8000, 12000, 8000, 6000, 20000, 9000, 12000};
      int[] it =    {3000, 9000, 1000, 2000, 20000, 4400, 10000};
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Employee Number: ");
      int n=sc.nextInt();
      boolean found=false;
      for(int i=0;i<basic.length;i++) {
    	  if(empno[i]==n) {
    		  String designation;
    		  int DA=0;
    		  switch(desigCode[i]) {
    		  case 'e':
    			  designation="Engineer";
    			  DA=20000;
    			  break;
    		  case 'c':
    			  designation="Consultant";
    			  DA=32000;
    			  break;
    		  case 'k':
    			  designation="Clerk";
    			  DA=12000;
    			  break;
    		  case 'r':
    			  designation="Receptionist";
    			  DA=15000;
    			  break;
    		  case 'm':
    			  designation="Manager";
    			  DA=40000;
    			  break;
    		  default:
    			designation="Unknown";
    		  }
    		  int salary=basic[i]+hra[i]+DA-it[i];
    		  System.out.println("Emp No.\t\tEmp Name\t\tDepartment\tDesignation\tSalary");
    		  System.out.println(empno[i]+"\t\t"+EmpName[i]+"\t\t"+department[i]+"\t\t"+designation+"\t\t"+salary);
    		  found=true;
    		  break;
    	  }
      }
      if(!found) {
    	  System.out.println("There is no employee with empid: "+n);
      }
	}

}
