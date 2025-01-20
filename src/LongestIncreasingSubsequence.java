import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {

    //Medium 4: Longest Increasing Subsequence
    //Problem:
    //Write a function lengthOfLIS(nums: List[int]) -> int to find the length of the longest strictly increasing subsequence.
    //
    //Example:
    //
    //python
    //Copy
    //Edit
    //Input: nums = [10, 9, 2, 5, 3, 7, 101, 18]
    //Output: 4 (Subsequence: [2, 3, 7, 101])
    //Constraints:
    //
    //1 <= len(nums) <= 10^4

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(Arrays.asList(10, 9, 2, 5, 3, 7, 101, 18, 102, 8, 9, 10)));
    }

    static List<Integer> lengthOfLIS(List<Integer> inputNumbers) {
        List<Integer> finalList = new ArrayList<>();

        if (inputNumbers == null || inputNumbers.isEmpty()) {
            return finalList;
        }


        finalList.add(inputNumbers.get(0));

        for (int i = 1; i < inputNumbers.size(); i++) {
            int current = inputNumbers.get(i);

            if (current > finalList.get(finalList.size() - 1)) {
                finalList.add(current);
            } else {
                int low = 0, high = finalList.size() - 1;
                while (low < high) {
                    int mid = low + (high - low) / 2;
                    if (finalList.get(mid) >= current) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
                finalList.set(low, current);
            }
        }

        return finalList;
    }

    //        for (int i = 0; i < inputNumbers.size(); i++) {
//            if (i == inputNumbers.size() - 1) {
//                if (inputNumbers.get(i - 1) > inputNumbers.get(i - 2) && inputNumbers.get(i - 1) > inputNumbers.get(i)) {
//                    finalList.add(inputNumbers.get(i - 1));
//                }
//                if (inputNumbers.get(i) > inputNumbers.get(i - 1)){
//                    finalList.add(inputNumbers.get(i));
//                }
//                    break;
//            }
//            if (inputNumbers.get(i + 1) > inputNumbers.get(i)) {
//                finalList.add(inputNumbers.get(i));
//            }
//
//        }
//        return finalList;
//    }

}
