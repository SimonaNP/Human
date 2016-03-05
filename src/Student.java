
public class Student extends Human {
	private float grade;
	private byte number;

	public float getGrade() {
		return grade;
	}

	public Student(long EGN, int age) {
		super(EGN, age);

	}

	public void setGrade(byte grade) {
		if (grade >= 2 && grade <= 6) {
			this.grade = grade;
		} else {
			this.grade = 4;
		}

	}

	public byte getNumber() {
		return number;
	}

	public void setNumber(byte number) {
		this.number = number;
	}

	public boolean hasHomework(boolean handedOverHomework, boolean isHomeworkTrue) {
		return (handedOverHomework && isHomeworkTrue);
	}

}
