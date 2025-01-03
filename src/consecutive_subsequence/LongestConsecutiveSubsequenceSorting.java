package consecutive_subsequence;

import java.util.Arrays;

public class LongestConsecutiveSubsequenceSorting {
    public static int longestConsecutive(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        Arrays.sort(arr);
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        maxLength = Math.max(maxLength, currentLength);
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 4, 3};
        System.out.println("Using Sorting: " + longestConsecutive(arr));
    }
}
