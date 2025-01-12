import java.util.*;

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
        String s = "eeccebaec";

        char[] stringToCharArray = s.toCharArray();
        Set<Character> uniqueCharacters = new LinkedHashSet<>();
        List<Character> listOfUsableCharacters = new ArrayList<>();
        StringBuilder finalString = new StringBuilder();

        for (char ch : stringToCharArray) {
            uniqueCharacters.add(ch);
        }
        if (!uniqueCharacters.isEmpty()) {
            listOfUsableCharacters.add(uniqueCharacters.stream().toList().get(0));
            if (uniqueCharacters.size() > 1) {
                listOfUsableCharacters.add(uniqueCharacters.stream().toList().get(1));
            }
        }

        for (char ch : stringToCharArray) {
            if (listOfUsableCharacters.contains(ch)) {
                finalString.append(ch);
            }
            if (!s.contains(finalString)) {
                finalString.delete(finalString.length()-1);
            }
        }


        System.out.println(finalString.length());
        System.out.println(finalString);
    }
}

