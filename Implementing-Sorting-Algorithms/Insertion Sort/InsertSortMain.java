import java.util.Arrays;

class InsertSortMain {
	public static void main(String[] args) {
		int[] data = {52,33,25,78,93,95,108,12,11};
		System.out.println("Original Data: " + Arrays.toString(data));
    
		int[] insertionSorted = insertionSort(data);
		System.out.println("Sorted Data: " + Arrays.toString(insertionSorted) + "\n");
	}
	
	private static int[] insertionSort(int[] arr) {
		int arrLength = arr.length;
		for(int i=1; i < arrLength; i++) {
			int compIndex = i;
			for(int j=i-1; j >= 0; j--) { //could use while loop instead of for & break
				if(arr[compIndex] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[compIndex];
					arr[compIndex] = temp;
					compIndex = j;
				}
				else {
					break;
				}
			}
		}
		
		return arr;
	}
}
