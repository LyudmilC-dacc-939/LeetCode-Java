import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithTwoChars {

    //Medium 2: Longest Substring with At Most Two Distinct Characters
    //Problem:
    //Given a string s, return the length of the longest substring that contains at most two distinct characters.
    //
    //Example:
    //
    //python
    //Copy code
    //Input: s = "eceba"
    //Output: 3
    //Explanation: The substring is "ece" which contains 2 distinct characters.
    //Constraints:
    //
    //1 <= len(s) <= 10^5
    //s consists of English letters only.

    public static void main(String[] args) {
        String s = "eceba";

        char[] stringToCharArray = s.toCharArray();
        Set<Character> uniqueCharacters = new HashSet<>();
        StringBuilder finalString = new StringBuilder();

        for (char ch : stringToCharArray) {
            uniqueCharacters.add(ch);
            finalString.append(ch);
            if(uniqueCharacters.size() == 2){
                break;
            }
        }

        System.out.println(finalString.length());
    }
}
