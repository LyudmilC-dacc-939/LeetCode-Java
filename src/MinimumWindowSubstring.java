import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    //Hard 1: Minimum Window Substring
    //Problem:
    //Given two strings s and t, return the minimum window substring of s such that
    // every character in t appears in the window.
    //
    //Example:
    //
    //python
    //Copy
    //Edit
    //Input: s = "ADOBECODEBANC", t = "ABC"
    //Output: "BANC"
    //Constraints:
    //
    //1 <= len(s), len(t) <= 10^5

    public static void main(String[] args) {
        System.out.println(minimumWindowSubstring("abcdefg", "gfa"));
        System.out.println(minimumWindowSubstring("ADOBECODEBANC", "ABC"));
        System.out.println(minimumWindowSubstring("kropotkin", "pti"));
        System.out.println(minimumWindowSubstring("acbbaca", "aba"));
    }

    static String minimumWindowSubstring(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0, minLength = Integer.MAX_VALUE, matchCount = 0;
        int startIndex = -1;
        Map<Character, Integer> windowFreq = new HashMap<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            windowFreq.put(currentChar, windowFreq.getOrDefault(currentChar, 0) + 1);

            if (tFreq.containsKey(currentChar) && windowFreq.get(currentChar).equals(tFreq.get(currentChar))) {
                matchCount++;
            }

            while (matchCount == tFreq.size()) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);

                if (tFreq.containsKey(leftChar) && windowFreq.get(leftChar) < tFreq.get(leftChar)) {
                    matchCount--;
                }

                left++;
            }

            right++;
        }

        if (startIndex == -1) {
            int firstOccurrence = Integer.MAX_VALUE;
            int lastOccurrence = Integer.MIN_VALUE;

            for (char c : t.toCharArray()) {
                int index = s.indexOf(c);
                if (index == -1) {
                    return "";
                }
                firstOccurrence = Math.min(firstOccurrence, index);
                lastOccurrence = Math.max(lastOccurrence, s.lastIndexOf(c));
            }
            return s.substring(firstOccurrence, lastOccurrence + 1);
        }

        return s.substring(startIndex, startIndex + minLength);
    }
}

