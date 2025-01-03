package consecutive_subsequence;

import java.util.*;
import java.util.stream.Collectors;

public class LongestConsecutiveSubsequenceLambda {
    public static int longestConsecutive(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        List<Integer> sortedList = Arrays.stream(arr)
                .distinct()
                .sorted()
                .boxed()
                .toList();

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < sortedList.size(); i++) {
            if (sortedList.get(i) == sortedList.get(i - 1) + 1) {
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
        int[] arr = {2, 6, 1, 9, 4, 5, 3};
        System.out.println("Using Lambda/Streams: " + longestConsecutive(arr));
    }
}
