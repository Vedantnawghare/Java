public class Student {
	private int rollno;
	private String name;
	private String branch;
	
	public void setStudent(int rollno, String name, String branch) {
		this.rollno = rollno; //This keyword will diferentiate between local and instance variable
		this.name = name;     //RHS - local variable & LHS - instance variable
		this.branch = branch;
	}
	
	public void getStudent() {
		
		System.out.println("Roll Number is : "+rollno);
		System.out.println("Name is : "+name);
		System.out.println("Branch is :"+branch);
	}
}


public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		Student s2 = new Student();
		
		s1.setStudent(100, "Abc", "CSE");
		
		s1.getStudent();
	}

}
