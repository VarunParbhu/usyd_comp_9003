import java.util.ArrayList;

public class Grade {

	private String gradeName;
	private int grade;

	public Grade(String gradeName, int grade) {
		this.gradeName = gradeName;
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}
	
	public String getGradeName() {
		return gradeName;
	}
	
	
	public static void calculateGrades(Subject subject, Student[] students, int[] grades) {
		/****TODO****/
		//Hint, you can use either null for initialising a studentgrade without an assigned grade
		//Or you can create a grade called None.
		
	}
	
	
	//Example Main Method
	public static void main(String[] args) {
		//Grade rules used in subject
		Grade[] rules = new Grade[5];
		rules[0] = new Grade("Fail", 0);
		rules[1] = new Grade("Pass", 50);
		rules[2] = new Grade("Credit", 65);
		rules[3] = new Grade("Distinction", 75);
		rules[4] = new Grade("High Distinction", 85);

		//Subject
		Subject subject = new Subject("INFO1103", rules);
		
		//Student Array
		Student[] students = new Student[3];
		students[0] = new Student("Jeff");
		students[1] = new Student("Jared");
		students[2] = new Student("Jane");

		//Marks array
		int[] marks = new int[3];
		marks[0] = 50;
		marks[1] = 76;
		marks[2] = 85;

		calculateGrades(subject, students, marks);

		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].getName() + "---");
			ArrayList<StudentGrade> sGrades = students[i].getGrades();
			for(int j = 0; j < sGrades.size(); j++) {
				System.out.println(sGrades.get(j).getSubject().getName() + " : " + sGrades.get(j).getGrade().getGradeName());
			}
		}

	}
	
}
