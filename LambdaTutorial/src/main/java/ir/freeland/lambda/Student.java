package ir.freeland.lambda;

public class Student {
	
    private String firstName;
    private String lastName;
    private int age;
    private int grade;
    
    
	public Student(String firstName, String lastName, int age, int grade) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.grade = grade;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public int getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", grade=" + grade + "]";
	} 
    
	
    


}
