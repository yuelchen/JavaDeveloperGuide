import java.util.Arrays;

class QuickSortMain {
	public static void main(String[] args) {
		int[] sample = {10,7,3,1,5,8,9,6,2,4};
		System.out.println("Original Sample: " + Arrays.toString(sample));
		
		int sampleLength = sample.length;
		quickSort(sample, 0, sampleLength-1);
		System.out.println("Sorted Sample: " + Arrays.toString(sample));
	}
	
	private static void quickSort(int[] arr, int head, int tail) {
		if(head < tail) {
			int pivot = getPivot(arr, head, tail);
			quickSort(arr, 0, pivot-1);
			quickSort(arr, pivot+1, tail);
		}
	}
	
	private static int getPivot(int[] arr, int head, int tail) {
		//make pivot number always the last element
		int pivot = arr[tail];
		
		int exchangeIndex = -1;
		for(int index=0; index <= tail; index++) {
			if(arr[index] <= pivot) {
				exchangeIndex++;
				int temp = arr[index];
				arr[index] = arr[exchangeIndex];
				arr[exchangeIndex] = temp;
			}
		}
		
		return exchangeIndex;
	}
}
