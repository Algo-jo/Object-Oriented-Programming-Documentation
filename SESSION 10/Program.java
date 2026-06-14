package session10;

public class Program {

	public static void main(String[] args) {
		Integer[] scores = {100,20,30,90,50};
		GenericSelectionSort sorter = new GenericSelectionSort();
		sorter.sort(scores);
		sorter.print(scores);
		
		String names[] = {"Michael", "Damian", "Budi"};
		sorter.print(scores);
		sorter.print(names);
		
		Students[] students = {
			new Student("Michael", 2028),
			new Student("Kevin", 2028),
			new Student("El Prasasti", 2024)
		}
		sorter.sort(students);
	}

}
