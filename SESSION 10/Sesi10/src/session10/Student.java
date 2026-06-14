package session10;

public class Student implements Comparable<Student>{
	private String name;
	private Integer cohort;
	public Student(String n, int c) {
		name = n;
		cohort = c;
	}
	public String toString() {
		return cohort + ": " + name;
	}
	@Override
	public int compareTo(Student otherStudent) {
		return cohort.compareTo(otherStudent.cohort);
//		if(this.cohort < otherStudent.cohort)
//			return -1;
//		if (this.cohort > otherStudent.cohort)
//			return 1;
//		return 0;
	}
	
}
