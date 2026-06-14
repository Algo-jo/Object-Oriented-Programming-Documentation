import java.util.ArrayList;

public class Student {
	private String studentID, name;
	private int age, creditTaken;
	private boolean hasSafetyTraining;
	private ArrayList<Course> enrolledCourses = new ArrayList<>();
	
	public Student(String studentID, String name, int age) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		this.creditTaken = 0;
		this.hasSafetyTraining = false;
	}
	
	public boolean isHasSafetyTraining() {
		return hasSafetyTraining;
	}
	public void setHasSafetyTraining(boolean hasSafetyTraining) {
		this.hasSafetyTraining = hasSafetyTraining;
	}
	//===========================================================
	public int getCredits() {
		return this.creditTaken;
	}
	
	public void attemptSafetyTraining() {
		this.hasSafetyTraining = true;
	}
	//===========================================================
	public void attemptEnroll(Course c) {
		this.enrolledCourses.add(c);
		this.creditTaken += c.credit;
	}
	
	public ArrayList<Course> getEnrolledCourses(){
		return enrolledCourses;
	}
}
