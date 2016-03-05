public class Human extends EGNExtractor {
	private long EGN;
	private int age;

	public long getEGN() {
		return EGN;
	}

	public void setEGN(long EGN) {
		this.EGN = EGN;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Human(long EGN, int age) {
		setEGN(EGN);
		setAge(age);
	}

	public void getGender() {
		System.out.println(extractEGN(this.EGN));
	}

}
