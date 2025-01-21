import java.util.ArrayList;
import java.util.List;

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
        int arrayLength = arr.length;
        List<List<Integer>> productOfArray = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();

        for (int i = 0; i < arrayLength; i++) { // Start at each element in the array
            long subarrayProduct = 1;
            for (int j = i; j < arrayLength; j++) { // Extend the subarray to include more elements
                subarrayProduct = subarrayProduct * arr[j]; // Add the current element to the subarray product
                System.out.println(subarrayProduct);
            }
        }
//        for (int i = 0; i < arrayLength; i++) { // Start at each element in the array
//            for (int j = i + 1; j < arrayLength + 1; j++) { // Extend the subarray to include more elements
//
//            }
//        }
    }
}
