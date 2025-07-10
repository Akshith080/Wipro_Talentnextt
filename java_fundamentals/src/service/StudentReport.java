package service;
import exception1.*;
import bean.*;
public class StudentReport {
	public String findGrades(Student studentobject) {
		int sum=0;
		for(int mark:studentobject.getMarks()) {
			sum+=mark;
			if(mark<35) {
				studentobject.setGrade("F");
						return studentobject.getGrade();
			}
		}
		if(sum < 150 ) {
            studentobject.setGrade("C");
        } 
        else if (sum < 200 ) 
        {
            studentobject.setGrade("B");
        } 
        else if( sum < 250 ) 
        {
            studentobject.setGrade("A");
        } 
        else 
        {
            studentobject.setGrade("A+");
        }

        return studentobject.getGrade();
		
	}
	 public String validate( Student s ) throws NullNameException, NullMarksArrayException, NullStudentObjectException
	    {

	        if ( s == null ) {
	            throw new NullStudentObjectException() ; 
	        }
	        else {
	            if ( s.getMarks() == null )
	            {
	                throw new NullMarksArrayException() ;
	            } 
	            if ( s.getName() == null )
	            {
	                throw new NullNameException() ;
	            } 
	        }
	        return "VALID" ; 
	    }
}
