import java.util.Arrays;

public class RecursiveBinarySearch {
	public static void main(String[] args) {
		int[] sample = {11,23,35,47,52,68,79,84,99,102};
		int searchableValue = 99;
		int sampleLength = sample.length;
		int recursiveResult = recursiveBinarySearch(sample, 0, sampleLength, searchableValue);
		System.out.println("Recursive binary search results for value '" + searchableValue + "' in array " + Arrays.toString(sample) + ": Index " + recursiveResult);
	}
  
	private static int recursiveBinarySearch(int[] arr, int start, int end, int value) {
		if(start > end) {
			return -1;
		}
		else {
			int midIndex = ((start + end) / 2);
			int midValue = arr[midIndex];
			if(midValue > value) {
				end = midIndex - 1;
				return recursiveBinarySearch(arr, start, end, value);
			}
			else if (midValue < value) {
				start = midIndex + 1;
				return recursiveBinarySearch(arr, start, end, value); 
			}
			else {
				return midIndex;
			}
		}
	}
}
