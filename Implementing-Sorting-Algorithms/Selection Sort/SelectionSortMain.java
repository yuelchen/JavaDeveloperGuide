import java.util.Arrays;

class SelectionSortMain {
	public static void main(String[] args) {
		int[] data = {10,60,40,50,90,80,75,20,30};
		System.out.println("Original Data: " + Arrays.toString(data));
    
		int[] selectionSorted = selectionSort(data);
		System.out.println("Sorted Data: " + Arrays.toString(selectionSorted) + "\n");
	}
	
	private static int[] selectionSort(int[] arr) {
		int arrLength = arr.length;
		for(int i=0; i < arrLength; i++) {
			int smallestIndex = i;
			for(int j=i+1; j < arrLength; j++) {
				if(arr[smallestIndex] > arr[j]) {
					smallestIndex = j;
				}
			}
			
			if(i != smallestIndex) {
				int temp = arr[i];
				arr[i] = arr[smallestIndex];
				arr[smallestIndex] = temp;
			}
		}
		
		return arr;
	}
}
