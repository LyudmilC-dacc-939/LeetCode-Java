import java.util.HashSet;
import java.util.Set;

public class SmallestMissingPositiveInteger {

    //Hard: Smallest Missing Positive Integer
    //Problem:
    //Given an unsorted array of integers, find the smallest missing positive integer.
    //
    //Example:
    //
    //python
    //Copy code
    //Input: nums = [3, 4, -1, 1]
    //Output: 2
    //Explanation: The smallest positive integer 2 is missing.
    //Constraints:
    //
    //1 <= len(nums) <= 10^5
    //-10^6 <= nums[i] <= 10^6
    //Solve it in O(n) time and constant space.

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 17, 1, 2};
        int smallestMissingPositiveNumber = 1;
        boolean isSmallestPositiveInt = false;

        Set<Integer> setOfNums = new HashSet<>();
        for (int num : arr) {
            setOfNums.add(num);
        }

        do {
            if (setOfNums.contains(smallestMissingPositiveNumber)) {
                smallestMissingPositiveNumber++;
            }
            isSmallestPositiveInt = true;
        } while (!isSmallestPositiveInt);
      /*  //Wrong Solution:
        int smallestPositiveNumber = 0;
        int secondSmallestPositiveNumber = 0;
        int smallestMissingPositiveNumber;

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j] && arr[i] > 0 && arr[j] > 0) {
                    smallestPositiveNumber = arr[i];
                    secondSmallestPositiveNumber = arr[j];
                } else {
                    smallestPositiveNumber = arr[j];
                    secondSmallestPositiveNumber = arr[i];
                }

            }*/

    }

}

