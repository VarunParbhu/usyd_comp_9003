public class StudentGrade {

  private Subject subject;
  private int studentGrade;
  private Grade assignedGrade;

  public StudentGrade(Subject subject, int studentGrade, Grade assignedGrade) {
    this.subject = subject;
    this.assignedGrade = assignedGrade;
    this.studentGrade = studentGrade;
  }

  public int getStudentGrade() {
    return studentGrade;
  }

  public Grade getGrade() {
    return assignedGrade;
  }
  
  public void updateGrade(Grade g) {
	  assignedGrade = g;
  }
  
  public Subject getSubject() {
	  return subject;
  }

}

