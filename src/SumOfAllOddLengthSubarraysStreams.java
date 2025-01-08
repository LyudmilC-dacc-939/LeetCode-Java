import java.util.stream.IntStream;

public class SumOfAllOddLengthSubarraysStreams {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};

        // Calculate the total sum of all odd-length subarrays
        int totalSum = IntStream.range(0, arr.length) // Outer loop: start index of subarrays
                .flatMap(i -> IntStream.range(i, arr.length) // Inner loop: end index of subarrays
                        .filter(j -> (j - i + 1) % 2 != 0) // Check if subarray length is odd
                        .map(j -> IntStream.rangeClosed(i, j) // Sum elements in the subarray
                                .map(k -> arr[k]) // Map to actual elements in the subarray
                                .sum())) // Calculate the sum of the current subarray
                .sum(); // Total sum of all odd-length subarrays

        System.out.println("Total sum of odd-length subarrays: " + totalSum);
    }
}


