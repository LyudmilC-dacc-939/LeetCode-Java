import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveDuplicatesFromSortedArray {

    //Medium 1: Remove Duplicates from Sorted Array II
    //Problem:
    //Given a sorted array nums, remove duplicates in place such that each element appears at most twice and return
    // the new length of the array.
    //
    //Example:
    //
    //python
    //Copy
    //Edit
    //Input: nums = [1, 1, 1, 2, 2, 3]
    //Output: 5 (Modified nums = [1, 1, 2, 2, 3])
    //Constraints:
    //
    //1 <= len(nums) <= 10^5

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }

    static List<Integer> removeDuplicates(int[] nums) {
        int counter = 0;
        List<Integer> listWithRemovedDuplicates = Arrays.stream(nums).boxed().toList();
        for (int i = 0; i <= listWithRemovedDuplicates.size(); i++) {
            for (int j = i + 1; j <= listWithRemovedDuplicates.size(); j++) {
                if (Objects.equals(listWithRemovedDuplicates.get(i), listWithRemovedDuplicates.get(j))) {
                    counter++;
                }
                if (counter == 2) {
                    listWithRemovedDuplicates.remove(j);
                    counter = 0;
                }
            }
        }
        return listWithRemovedDuplicates;
    }

}
