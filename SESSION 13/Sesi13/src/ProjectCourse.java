
public class ProjectCourse extends Course {

	public ProjectCourse(String code, String name, int credit, int capacity) {
		super(code, name, credit, capacity);
	}

	@Override
	public boolean enroll(Student s) {
		if(s.getCredits() < 10) {
			return false;
		}
		s.attemptEnroll(this);
		return true;
	}

}
