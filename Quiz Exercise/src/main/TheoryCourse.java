package main;

public class TheoryCourse extends Course {

	public TheoryCourse(String code, String name, int capacity, int credit) {
		super(code, name, capacity, credit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean enroll(Student student) {
		return false;
	}


}
