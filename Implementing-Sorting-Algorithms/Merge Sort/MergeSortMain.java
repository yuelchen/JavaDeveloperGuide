/**
 * Author: Yue L. Chen
 * Description: Merge sort logic with visual output; see below for console output when executing this code as Java application.
 * Date: November 19th 2019
 * ============================================================================================================================
 * Original: [11, 53, 65, 23, 49, 97, 88, 34]
 * 	[1] SPLIT: [11, 53, 65, 23, 49, 97, 88, 34] to get [11, 53, 65, 23] and [49, 97, 88, 34]
 * 		[2] SPLIT: [11, 53, 65, 23] to get [11, 53] and [65, 23]
 * 			[3] SPLIT: [11, 53] to get [11] and [53]
 * 			[3] MERGE: [11] with [53] to produce: [11, 53]
 * 			[3] SPLIT: [65, 23] to get [65] and [23]
 * 			[3] MERGE: [65] with [23] to produce: [23, 65]
 * 		[2] MERGE: [11, 53] with [23, 65] to produce: [11, 23, 53, 65]
 * 		[2] SPLIT: [49, 97, 88, 34] to get [49, 97] and [88, 34]
 * 			[3] SPLIT: [49, 97] to get [49] and [97]
 * 			[3] MERGE: [49] with [97] to produce: [49, 97]
 * 			[3] SPLIT: [88, 34] to get [88] and [34]
 * 			[3] MERGE: [88] with [34] to produce: [34, 88]
 * 		[2] MERGE: [49, 97] with [34, 88] to produce: [34, 49, 88, 97]
 * 	[1] MERGE: [11, 23, 53, 65] with [34, 49, 88, 97] to produce: [11, 23, 34, 49, 53, 65, 88, 97]
 * 	Sorted: [11, 23, 34, 49, 53, 65, 88, 97]
 * ============================================================================================================================
 */
import java.util.Arrays;

public class MergeSortMain {
	public static void main(String[] args) {
		int[] sample = {11, 53, 65, 23, 49, 97, 88, 34};
		System.out.println("Original: " + Arrays.toString(sample));
		
		int head = 0, counter = 0;
		int tail = sample.length - 1;
		mergeSort(sample, head, tail, counter);
		System.out.println("Sorted: " + Arrays.toString(sample));
	}
	
	private static void mergeSort(int[] arr, int head, int tail, int counter) {
		if(head < tail) { //if head is equal to or greater than end of range, then there is nothing more to split
			counter++;
			int mid = head + (tail - head) / 2;
			System.out.println(getTabs(counter) + "[" + counter + "] SPLIT: " + Arrays.toString(getArrayRange(arr, head, tail)) + " to get " + Arrays.toString(getArrayRange(arr, head, mid)) + " and " + Arrays.toString(getArrayRange(arr, mid+1, tail)));
			
			mergeSort(arr, head, mid, counter); //mergeSort call to split left half of array
			mergeSort(arr, mid+1, tail, counter); //mergeSort call to split right half of array			
			merge(arr, head, mid, tail, counter);
		}
	}
	
	private static void merge(int arr[], int head, int mid, int tail, int counter) {
		//Sample Input (smallest range): 0,0,1; 2,2,3; 4,4,5; 6,6,7
		
		//create left array given range
		int sizeOfLeft = mid - head + 1; //Sample Calculation: 0-0+1; 2-2+1; 4-4+1; 6-6+1
		int[] leftArr = new int[sizeOfLeft];
		for(int i=0; i<sizeOfLeft; i++) {
			leftArr[i] = arr[head+i];
		}
		
		//create right array given range
		int sizeOfRight = tail - mid; //Sample Calculation: 1-0; 3-2; 5-4; 7-6
		int[] rightArr = new int[sizeOfRight];
		for(int i=0; i<sizeOfRight; i++) {
			rightArr[i] = arr[mid+1+i]; 
		}
		
		//compare between left and right array indexes (ascending order)
		int left = 0;
		int right = 0;
		int index = head; //index overright at head (p) since merge should compare and order within given range
		while(left < sizeOfLeft && right < sizeOfRight) {
			if(leftArr[left] <= rightArr[right]) {
				arr[index] = leftArr[left];
				left++;
			}
			else {
				arr[index] = rightArr[right];
				right++;
			}
			index++;
		}
		
		//clean up any remaining index values from either array (should only be one which needs to satisfy due to while condition
		while(left < sizeOfLeft) {
			arr[index] = leftArr[left];
			left++;
			index++;
		}
		
		while(right < sizeOfRight) {
			arr[index] = rightArr[right];
			right++;
			index++;
		}
		
		System.out.println(getTabs(counter) + "[" + counter + "] MERGE: " + Arrays.toString(leftArr) + " with " + Arrays.toString(rightArr) + " to produce: " + Arrays.toString(getArrayRange(arr, head, tail)));
	}
	
	private static int[] getArrayRange(int[] arr, int start, int end) {
		int size = end - start + 1; //assumes user knows that end range should always be greater than start range
		int[] rangedArr = new int[size];
		for(int i=0; i<size; i++) {
			rangedArr[i] = arr[start+i];
		}
		return rangedArr;
	}
	
	private static String getTabs(int count) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<count-1; i++) {
			sb.append("\t");
		}
		return sb.toString();
	}
}
