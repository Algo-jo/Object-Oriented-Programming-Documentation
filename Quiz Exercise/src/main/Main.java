package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Course> courses = new ArrayList<>();
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		courses.add(new TheoryCourse("COMP6820", "Object Oriented Programming", 40, 5));
		courses.add(new TheoryCourse("COMP7001", "Artificial Intelligence", 30, 8));
		courses.add(new LabCourse("CLAB6820", "Object Oriented Programming", 40, 5));
		courses.add(new LabCourse("CLAB7010", "Artificial Intelligence", 30, 5));
		courses.add(new ProjectCourse("CPRJ8888", "Web Programming", 35, 10));
		courses.add(new ProjectCourse("CPRJ9999", "Mobile Programming", 35, 10));
		Student d = new Student();
		d.inputData();
		SafetyTrainingService safe = new SafetyTrainingService();
		
		Scanner scan = new Scanner(System.in);
		int input;
		do {
			System.out.println("\nSelect Your Action");
			System.out.println("1. Enroll Course");
			System.out.println("2. Attend Safety Training");
			System.out.println("3. View Enrolled Course");
			System.out.println("4. Exit");
			System.out.printf(">> ");
			input = scan.nextInt(); scan.nextLine();
			if(input == 1) {
				int increment = 1;
				System.out.println("no. code - name - capacity - credit");
				System.out.println("===================================");
				for(Course i : courses) {
					System.out.println(increment + ". " + i);
					increment++;
				}
				System.out.println("===================================");
				System.out.printf("Choose course to enroll (1-6)[0 to exit]: ");
				int index = scan.nextInt(); scan.nextLine();
				if(safe.hasAttend == true) {
					d.attemptEnroll(courses.get(index));
					d.setCreditTaken(courses.get(index).getCredit());
					System.out.printf("%s enrolled in %s-%s -> SUCCESS\n", d.getName(), courses.get(index).getCode(), courses.get(index).getName());
				}
				else if(safe.hasAttend == false) System.out.printf("%s enrolled in %s-%s -> FAILED (requires safety training)\n", d.getName(), courses.get(index).getCode(), courses.get(index).getName());
				
				System.out.println("Press Enter to continue..."); scan.nextLine();
			}
			else if(input == 2) {
				if(safe.hasAttend == false) {
					System.out.printf("%s has succesfully attempted safety training\n", d.getName());
					safe.hasAttend = true;
				}
				else {
					System.out.printf("%s has already attempted safety training\n", d.getName());
				}
			}
			else if(input == 3) {
				int inc = 1;
				System.out.println("no. code - name - capacity - credit");
				System.out.println("===================================");
				for(int i = 0; i < d.getEnrolledCourses().size(); i++) {
					System.out.printf("%d. %s - %s - %d - %d",
							d.getEnrolledCourses().get(i).getCode(),
							d.getEnrolledCourses().get(i).getName(),
							d.getEnrolledCourses().get(i).getCapacity(),
							d.getEnrolledCourses().get(i).getCredit());
					inc++;
				}
				System.out.println();
				
			}
		}while(input != 4);
	}

}
