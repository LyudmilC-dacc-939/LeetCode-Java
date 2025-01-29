import java.util.LinkedList;
import java.util.List;

public class CountBinarySubstring {

    //Easy 2: Count Binary Substrings
    //Problem:
    //Write a function countBinarySubstrings(s: str) -> int that counts substrings with an equal number of 0s and 1s.
    //
    //Example:
    //
    //python
    //Copy
    //Edit
    //Input: s = "00110011"
    //Output: 6
    //Explanation: Substrings are "0011", "01", "1100", "10", "0011", and "01".
    //Constraints:
    //
    //1 <= len(s) <= 10^5
    //s contains only 0s and 1s.

    public static void main(String[] args) {
        countBinarySubstrings("6236236");
        countBinarySubstrings("00110011");
    }

    static void countBinarySubstrings(String str) {
        if (!str.matches("^[01]+$")) {
            System.out.println("Invalid input, only 0s and 1s allowed");
            return;
        }

        int numberOfSubstring = 0;
        List<String> listOfSubstrings = new LinkedList<>();

        int prevGroupCount = 0, currGroupCount = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currGroupCount++;
            } else {
                prevGroupCount = currGroupCount;
                currGroupCount = 1;
            }
            if (prevGroupCount >= currGroupCount) {
                numberOfSubstring++;
                listOfSubstrings.add(str.substring(i - currGroupCount * 2 + 1, i + 1));
            }
        }

        System.out.println(listOfSubstrings);
        System.out.println(numberOfSubstring);
    }

}
