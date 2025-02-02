import java.util.Arrays;

public class JumpGame {

    //Medium 3: Jump Game
    //Problem:
    //Given an array of non-negative integers nums, where nums[i] represents the maximum jump length from index i, write a function canJump(nums: List[int]) -> bool to determine if you can reach the last index.
    //
    //Example:
    //
    //python
    //Copy
    //Edit
    //Input: nums = [2, 3, 1, 1, 4]
    //Output: True
    //Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
    //Constraints:
    //
    //1 <= len(nums) <= 10^4

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 3}));
        System.out.println(canJump(new int[]{2, 2, 0, 2, 4}));
        System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));
        //nums = [3, 2, 1, 0, 4]
    }

    static Boolean canJump(int[] nums) {
        int farthestNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > farthestNumber) {
                return false;
            }
            if (i + nums[i] > farthestNumber) {
                farthestNumber = i + nums[i];
            }
            //Alternatively we can use
            //farthest = Math.max(farthest, i + nums[i]);
            if (farthestNumber >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
