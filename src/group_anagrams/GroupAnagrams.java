package group_anagrams;

import java.util.*;

public class GroupAnagrams {

    //Medium 2: Group Anagrams
    //Problem:
    //Write a function groupAnagrams(words: List[str]) -> List[List[str]] that groups anagrams together.
    //
    //Example:
    //
    //python
    //Copy
    //Edit
    //Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
    //Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
    //Constraints:
    //
    //1 <= len(words) <= 10^4
    //words[i] consists of lowercase English letters.

    public static void main(String[] args) {
        System.out.println(groupAnagrams(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat")));
    }

    static List<List<String>> groupAnagrams(List<String> strings) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strings) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);

            anagramGroups.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(str);
        }


        List<List<String>> groupedAnagrams = new ArrayList<>(anagramGroups.values());
        return groupedAnagrams;
    }
}
