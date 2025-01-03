package consecutive_subsequence;

import java.util.HashSet;

public class LongestConsecutiveSubsequenceSet {
    public static int longestConsecutive(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;


                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                maxLength = Math.max(maxLength, currentStreak);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {17, 30, 5, 18, 303, 506, 19, 20};
        System.out.println("Using Set: " + longestConsecutive(arr));
    }
}
