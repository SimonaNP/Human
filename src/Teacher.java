
public class Teacher extends Human {
	private int students;
	private int classesPerWeek;

	public Teacher(long EGN, int age) {
		super(EGN, age);

	}

	public int getStudents() {
		return students;
	}

	public void setStudents(int students) {
		this.students = students;
	}

	public int getClassesPerWeek() {
		return classesPerWeek;
	}

	public void setClassesPerWeek(int classesPerWeek) {
		this.classesPerWeek = classesPerWeek;
	}

	public double salary(double salaryPerClass) {
		return salaryPerClass * getClassesPerWeek();
	}

}
