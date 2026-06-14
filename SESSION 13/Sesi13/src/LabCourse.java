
public class LabCourse extends Course {

	public LabCourse(String code, String name, int credit, int capacity) {
		super(code, name, credit, capacity);
	}

	@Override
	public boolean enroll(Student s) {
		if(s.isHasSafetyTraining() == false) {
			return false;
		}
		s.attemptEnroll(this);
		return true;
	}

}
