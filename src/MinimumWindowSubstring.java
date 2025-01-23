import java.util.LinkedHashMap;
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
        System.out.println(minimumWindowSubstring("ADOBECODEBANC", "ABC"));
        System.out.println(minimumWindowSubstring("kropotkin", "pti"));
    }

    static String minimumWindowSubstring(String mainString, String substring) {
        char[] mainStringToCharArray = mainString.toCharArray();
        Map<Integer, Character> collectedString = new LinkedHashMap<>();
        int lettersInARow = -1;

        for (char character : mainStringToCharArray) {
            if (substring.contains(Character.toString(character))) {
                lettersInARow++;

            } else {
                lettersInARow = -1;
            }
            if (lettersInARow > -1) {
                collectedString.put(lettersInARow, character);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Character value : collectedString.values()) {
            result.append(value);
        }
        return result.toString();
    }
}
