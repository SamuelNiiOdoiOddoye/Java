import java.util.Arrays;

public class RadixSort {
  
  // Radix Sort function
  public static void radixSort(int[] arr) {
    // Find the maximum number to determine the number of digits
    int max = Arrays.stream(arr).max().getAsInt();

    // Perform counting sort for every digit
    for (int exp = 1; max / exp > 0; exp *= 10) {
      countingSort(arr, exp);
    }
  }

  // Counting Sort function to sort the array based on the digit at exp
  private static void countingSort(int[] arr, int exp) {
    int n = arr.length;
    int[] output = new int[n];
    int[] count = new int[10];
    Arrays.fill(count, 0);

    // Count the occurrences of each digit in the input array
    for (int i = 0; i < n; i++) {
      count[(arr[i] / exp) % 10]++;
    }

    // Calculate the cumulative count array
    for (int i = 1; i < 10; i++) {
      count[i] += count[i - 1];
    }

    // Build the output array in sorted order
    for (int i = n - 1; i >= 0; i--) {
      output[count[(arr[i] / exp) % 10] - 1] = arr[i];
      count[(arr[i] / exp) % 10]--;
    }

    // Copy the sorted output array to the original array
    System.arraycopy(output, 0, arr, 0, n);
  }

  // Test the Radix Sort algorithm
  public static void main(String[] args) {
    int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
    System.out.println("Original Array: " + Arrays.toString(arr));

    radixSort(arr);

    System.out.println("Sorted Array: " + Arrays.toString(arr));
  }
}
