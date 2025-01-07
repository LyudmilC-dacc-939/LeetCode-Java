public class SumOfAllOddLengthSubarrays {
    /*
    Medium 1: Sum of All Odd-Length Subarrays
    Problem:
    Given an array of integers arr, return the sum of all possible odd-length subarrays.

    Example:

    python
    Copy code
    Input: arr = [1, 4, 2, 5, 3]
    Output: 58
    Explanation: The odd-length subarrays are [1], [4], [2], [5], [3], [1,4,2], [4,2,5], [2,5,3], [1,4,2,5,3]. Their sum is 58.
    Input: arr = [1, 4, 2, 5, 3, 8]
    1,4,2,5,3,8,142,425,253,538,14253,42538
    Input: arr = [1, 4, 2, 5, 3, 8, 7, 4, 2]
    1,4,2,5,3,8,7,4,2,142,425,253,538,387,874,742,14253,42538,25387,53874,38742,1425387,4253874,2538742,142538742
    */
    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 3};
        int arrayLength = arr.length; // Get the arrayLength of the input array
        long totalSum = 0; // Initialize a variable to store the sum of odd-arrayLength subarrays

        // If array arrayLength is odd, add 1 to the array arrayLength
        if (arrayLength % 2 != 0) {
            arrayLength += 1; // This is done to simplify the calculation of odd-arrayLength subarrays
        }

        // Initialize a counter to store the sum of subarrays
        long[] counter = new long[arrayLength + 1]; // Create an array to store the sum of subarrays

        // Initialize the sum of subarrays to 1
        counter[1] = arr[0]; // The sum of a subarray of arrayLength 1 is just the first element

        // Calculate the sum of subarrays for each element
        for (int i = 1; i < arrayLength; i++) { // This outer loop iterates over each element in the array
            // For each element, we calculate the sum of all subarrays ending at that element
            for (int j = i + 1; j <= arrayLength; j++) { // This inner loop calculates the sum of subarrays of increasing arrayLength
                counter[j] = counter[j - 1] + arr[i]; // The sum of a subarray ending at position j is the sum of the subarray ending at position j-1 plus the current element
            }
        }

        // Calculate the sum of odd-arrayLength subarrays
        for (int i = 1; i <= arrayLength; i += 2) { // This loop iterates over the indices of odd-arrayLength subarrays
            totalSum += counter[i]; // Add the sum of the current odd-arrayLength subarray to the total sum
        }

        System.out.println(totalSum);
    }
}

