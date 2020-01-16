import java.util.Arrays;

public class LinearBinarySearch {
	public static void main(String[] args) {
		int[] sample = {11,23,35,47,52,68,79,84,99,102};
		int searchableValue = 99;
		int linearResult = linearBinarySearch(searchableValue, sample);
		System.out.println("Linear binary search results for value '" + searchableValue + "' in array " + Arrays.toString(sample) + ": Index " + linearResult);
	}
	
	private static int linearBinarySearch(int val, int[] array) {
        int start = 0;
        int end = array.length - 1;
        while(start <= end) {
            int midIndex = ((start + end) / 2);            
            int midData = array[midIndex];
            if(midData == val) {
                return midIndex;
            }
            else if(midData > val) {
                end = midIndex - 1;
            }
            else if(midData < val) {
                start = midIndex + 1;
            }
        }
        
        return -1;
    }
}
