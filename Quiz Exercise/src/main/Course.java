package main;

public abstract class Course{

	protected String code, name;
	protected int capacity, maxCapacity, credit;
	
	public Course(String code, String name, int capacity, int credit) {
		this.code = code;
		this.name = name;
		this.capacity = this.maxCapacity = capacity;
		this.credit = credit;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}

	public abstract boolean enroll(Student student);
	
	public String toString() {
		return code + " - " + name + " - " + capacity + " - " + credit;
	}
}
