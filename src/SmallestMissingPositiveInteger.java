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
        int[] arr = {3, 4, -1, 1};
        int smallestPositiveNumber = 0;

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++) {
                if (i < j && i > 0) {
                    smallestPositiveNumber = i;
                } else if (i >= j && i > 0){
                    smallestPositiveNumber = j;
                }

            }

        System.out.println(smallestPositiveNumber);
    }

}

