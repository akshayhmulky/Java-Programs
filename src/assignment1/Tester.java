package assignment1;

public class Tester {

	public static void main(String[] args) {

	Student s = new Student();
	
	//Input
	s.setStudentId(101);
	s.setName("Vinay");
	s.setQualifyingExamMarks(90);
	s.setResidentStatus('H');
	s.setYearOfEngg(1);
		
	//Ouput	
	
	System.out.println("Student Name: " + s.getName());
	System.out.println("Student id: " + s.getStudentId());
	System.out.println("Qualifying Marks: " + s.getQualifyingExamMarks());
	System.out.println("Year of Engineering: " + s.getYearOfEngg());
	System.out.println("Residential Status: " + s.getResidentStatus());
	System.out.println("\n");
	
	Student s2 = new Student();
	
	//Input
	s2.setStudentId(102);
	s2.setName("Raj");
	s2.setQualifyingExamMarks(65);
	s2.setResidentStatus('D');
	s2.setYearOfEngg(4);	
		
	//Ouput	
	
	System.out.println("Student Name: " + s2.getName());
	System.out.println("Student id: " + s2.getStudentId());
	System.out.println("Qualifying Marks: " + s2.getQualifyingExamMarks());
	System.out.println("Year of Engineering: " + s2.getYearOfEngg());
	System.out.println("Residential Status: " + s2.getResidentStatus());

	}

}
