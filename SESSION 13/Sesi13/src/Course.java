
public abstract class Course {
	protected String code, name;
	protected int credit, capacity;
	
	public abstract boolean enroll(Student s);
	
	public Course(String code, String name, int credit, int capacity) {
		this.code = code;
		this.name = name;
		this.credit = credit;
		this.capacity = capacity;
	}
	
	public String toString() {
		return code + " - " + name + " - " + credit+ " - " + capacity;
	}
}
