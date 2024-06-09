import java.util.ArrayList;

public class Student {

	private ArrayList<StudentGrade> grades;
	private String name;


	public Student(String name) {
		this.name = name;
		grades = new ArrayList<StudentGrade>();
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<StudentGrade> getGrades() {
		return grades;
	}

	public void addGrade(StudentGrade grade) {
		grades.add(grade);
	}

}

