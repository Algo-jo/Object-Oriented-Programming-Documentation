package session10;

public class Program {

	public static void main(String[] args) {
		Integer[] scores = {100,20,30,90,50};
		GenericSelectionSort sorter = new GenericSelectionSort();
		sorter.sort(scores);
		for (int i=0; i<scores.length; i++)
			System.out.println(scores[i]);
	}

}
