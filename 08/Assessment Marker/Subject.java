public class Subject {

	private String name;
  private Grade[] grades;

	public Subject(String name, Grade[] grades) {
		this.name = name;
    this.grades = grades;
	}

  public String getName() {
    return name;
  }

  public Grade[] getGradingRules() {
    return grades;
  }



}

