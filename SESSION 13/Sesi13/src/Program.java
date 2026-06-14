import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	static ArrayList<Course> allCourses;
	static Student loggedInStudent;
	public static void main(String[] args) {
		initCourses();
//		login();
		menu();
	}
	
	
	private static void menu() {
		Scanner sc = new Scanner(System.in);
		int option;
		do {
			System.out.println("Select your action:");
			System.out.println("1. Enroll Course");
			System.out.println("2. Attend Safety Training");
			System.out.println("3. View Enrolled Course");
			System.out.println("4. Exit");
			System.out.printf(">> ");
			option = sc.nextInt();
			
			if(option == 2) {
//				loggedInStudent.attemptSafetyTraining();
				SafetyTrainingService sts = new SafetyTrainingService();
				sts.doSafetyTraining(loggedInStudent);
			}
			else if(option == 3) {
				viewEnrolledCourses();
			}
			else if(option == 1) {
				allCourses.get(0).enroll(loggedInStudent);
			}
			
		}while(option != 4);
		System.out.println("Byeee!");
	}


	private static void viewEnrolledCourses() {
		System.out.println("no. code - name - capacity - credit");
		System.out.println("==============================================");
		for(Course c : loggedInStudent.getEnrolledCourses()) {
			System.out.println(c);
		}
		System.out.println("Total credit: " + loggedInStudent.getCredits());
	}


	private static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your student data: ");
		String sid, name;
		int age;
		do {
			System.out.print("Student ID (must be 10 chars): ");
			sid = sc.nextLine();
		}while(sid.trim().length() != 10);
		
		do {
			System.out.print("Name (must be 3 chars at least): ");
			name = sc.nextLine();
		}while(name.trim().length() < 3);
		
		do {
			System.out.print("Age (must be 17 yo at least): ");
			age = sc.nextInt();
		}while(age < 17);
		loggedInStudent = new Student(sid, name, age);
	}


	public static void test() {
		System.out.println(allCourses);
		Student s1 = new Student("123", "Budiono Siregar", 8);
		
		s1.attemptSafetyTraining();
		System.out.println("before:" + s1.getCredits());
		allCourses.get(0).enroll(s1);
		allCourses.get(1).enroll(s1);
		boolean r = allCourses.get(4).enroll(s1);
		System.out.println(r ? "enrolled":"is not enrolled");
		System.out.println("after:" + s1.getCredits());
	}

	private static void initCourses() {
		allCourses = new ArrayList<>();
		allCourses.add(new TheoryCourse("COMP6820", "Object Oriented Programming", 5, 40));
		allCourses.add(new TheoryCourse("COMP7011", "Artificial Intelligence", 8, 30));
		allCourses.add(new LabCourse("CLAB6820", "Object Oriented Programming", 5, 40));
		allCourses.add(new LabCourse("CLAB7010", "Artificial Intelligence", 5, 30));
		allCourses.add(new ProjectCourse("CPRJ8888", "Web Programming", 10, 35));
		allCourses.add(new ProjectCourse("CPRJ9999", "Mobile Programming", 10, 35));
	}	

}







//int randInt = (int)(Math.random() * 10);
// 0 - 9 // starting point + random
//System.out.println(randInt);
