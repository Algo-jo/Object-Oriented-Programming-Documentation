package main;

import java.util.*;

public class Student {
	private String ID;
	private String name;
	private int age;
	public boolean hasSafetyTraining = false;
	public int creditTaken;

	SafetyTrainingService service = new SafetyTrainingService();
	public static ArrayList<Course> enrolledCourses = new ArrayList<>();
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public void inputData() {
		System.out.println("Please input your student data!");
		Scanner scan = new Scanner(System.in);
		do {
			System.out.printf("Student ID (must be 10 characters long): ");
			ID = scan.nextLine();
			this.setID(ID);
			if(ID.length() > 10) break;
		}while(true);
		
		do {
			System.out.printf("Name (min 3 characters): ");
			name = scan.nextLine();
			this.setName(name);
			if(name.length() > 3) break;
		}while(true);
		
		do {
			System.out.printf("Age (at least 17) ");
			age = scan.nextInt(); scan.nextLine();
			this.setAge(age);
			if(age > 17) break;
		}while(true);	
	}
	
	public int getCreditTaken() {
		return creditTaken;
	}

	public void setCreditTaken(int creditTaken) {
		this.creditTaken += creditTaken;
	}

	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void attemptEnroll(Course c) {
		this.enrolledCourses.add(c);
	}
	public void attemptSafetyTraining() {
		service.checkList();
	}
	public int getCredits() {
		return this.creditTaken;
	}

	public static ArrayList<Course> getEnrolledCourses() {
		return enrolledCourses;
	}

	public static void setEnrolledCourses(ArrayList<Course> enrolledCourses) {
		Student.enrolledCourses = enrolledCourses;
	}

}
