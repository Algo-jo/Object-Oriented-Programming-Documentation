
public class TheoryCourse extends Course {

	public TheoryCourse(String code, String name, int credit, int capacity) {
		super(code, name, credit, capacity);
	}

	@Override
	public boolean enroll(Student s) {
		s.attemptEnroll(this);
		return true;
	}

}
