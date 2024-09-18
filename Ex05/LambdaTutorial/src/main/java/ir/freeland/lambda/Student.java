package ir.freeland.lambda;

public class Student {
    public Student(String name, String family, int age, double grade) {
		super();
		this.name = name;
		this.family = family;
		this.age = age;
		this.grade = grade;
	}

	private String name;
    private String family;
    private int age;
    private double grade;

    @Override
    public String toString() {
        return "Student [name=" + name + ", family=" + family + ", age=" + age + ", grade=" + grade + "]";
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

}
