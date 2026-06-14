package session10;

public class GenericSelectionSort {

	public <E extends Comparable<E>> void sort(Integer arr[]) {
		int n = arr.length;
		for (int i=0; i<n; i++) {
			int minIdx = i;
			for (int j=i+1; j<n; j++) {
				if (arr[j].compareTo(arr[minIdx])) {
					minIdx = j;
				}
			}
			E tmp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = tmp;
		}
	}
	
	// Generic Method
	public <E> void print(hd arr[]) {
		for (int i=0; i<scores.length; i++)
			System.out.println(scores[i]);
	}
}
