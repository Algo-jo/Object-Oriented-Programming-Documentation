package session10;

public class GenericSelectionSort {

	public void sort(Integer arr[]) {
		int n = arr.length;
		for (int i=0; i<n; i++) {
			int minIdx = i;
			for (int j=i+1; j<n; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			Integer tmp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = tmp;
		}
	}
}
