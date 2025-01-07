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

        int[] arr = {1, 4, 2, 5, 3, 5, 2, 1, 20};
        int arrayLength = arr.length;
        long totalSum = 0; // Initialize a variable to store the sum of odd-length subarrays

        for (int i = 0; i < arrayLength; i++) { // Start at each element in the array
            long subarraySum = 0; // Sum of the current subarray
            for (int j = i; j < arrayLength; j++) { // Extend the subarray to include more elements
                subarraySum += arr[j]; // Add the current element to the subarray sum
                if ((j - i + 1) % 2 != 0) { // Check if the subarray length is odd
                    totalSum += subarraySum; // Add the sum of this odd-length subarray
                }
            }
        }

        System.out.println(totalSum); // Print the total sum of odd-length subarrays

        //### Summary:
        //1. Use the formula \Length of Subarray\ = j - i + 1
        //2. Check if: LengthOfSubarray % 2 =/= 0
        //3. Include only odd-length subarrays in the total sum.
    }
}

