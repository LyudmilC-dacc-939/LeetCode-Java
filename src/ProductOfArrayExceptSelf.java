import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    //Medium 3: Product of Array Except Self
//Problem:
//Given an array nums, return an array answer such that answer[i] is the product of all elements except nums[i].
// Solve it in O(n) without using division.
//
//Example:
//
//python
//Copy
//Edit
//Input: nums = [1, 2, 3, 4]
//Output: [24, 12, 8, 6]
//Constraints:
//
//2 <= len(nums) <= 10^5
//-30 <= nums[i] <= 30
//Product of elements fits in a 32-bit integer.

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = productExceptSelf(arr);
        System.out.println(Arrays.toString(result)); // Output: [24, 12, 8, 6]
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate the left cumulative product
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct; // Store the product of all elements to the left of i
            leftProduct *= nums[i];
        }

        // Step 2: Calculate the right cumulative product and combine with left
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct; // Multiply with the product of all elements to the right of i
            rightProduct *= nums[i];
        }

        return result;
    }
}



