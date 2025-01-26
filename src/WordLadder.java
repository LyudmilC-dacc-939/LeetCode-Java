import java.util.*;

public class WordLadder {

    //Hard 3: Word Ladder
    //Problem:
    //Given two words, beginWord and endWord, and a dictionary of words wordList, find the shortest transformation
    // sequence length such that:
    //
    //Only one letter can be changed at a time.
    //Each transformed word must exist in the wordList.
    //Example:
    //
    //python
    //Copy
    //Edit
    //Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
    //Output: 5 (Sequence: "hit" -> "hot" -> "dot" -> "dog" -> "cog")
    //Constraints:
    //
    //1 <= len(wordList) <= 5000
    //wordList[i].length == beginWord.length

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        String[] wordList = new String[]{"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(wordLadder(beginWord, endWord, wordList));
    }

    static int wordLadder(String beginWord, String endWord, String[] wordList) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(wordList));
        if (!wordSet.contains(endWord)) {
            return 0; // If the endWord is not in the list, return 0
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int steps = 1; // Start with 1 as the initial word is counted

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                String currentWord = queue.poll();

                // Check all possible transformations
                char[] wordArray = currentWord.toCharArray();
                for (int j = 0; j < wordArray.length; j++) {
                    char originalChar = wordArray[j];

                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == originalChar) continue;

                        wordArray[j] = c;
                        String transformedWord = new String(wordArray);

                        if (transformedWord.equals(endWord)) {
                            return steps + 1; // Found the endWord
                        }

                        if (wordSet.contains(transformedWord)) {
                            queue.add(transformedWord);
                            wordSet.remove(transformedWord); // Mark as visited
                        }
                    }

                    // Restore the original character
                    wordArray[j] = originalChar;
                }
            }

            steps++;
        }

        return 0; // No transformation sequence found
    }

//    static String wordLadder(String beginWord, String endWord, String[] wordList) {
//        StringBuilder finalResult;
//        int letterMatch = 0;
//        char[] beginWordToCharArray = beginWord.toCharArray();
//        char[] endWordToCharArray = endWord.toCharArray();
//
//        List<List<Character>> charWordArrayList = new ArrayList<>();
//
//        for (String str : wordList) {
//            List<Character> charList = new ArrayList<>();
//            for (char c : str.toCharArray()) {
//                charList.add(c);
//            }
//            charWordArrayList.add(charList);
//        }
//
//        for (int i = 0; i < charWordArrayList.size(); i++) {
//            for (int j = 0; j < charWordArrayList.get(i).size(); j++) {
//                if (beginWordToCharArray[j] == charWordArrayList.get(i).get(j)) {
//                    letterMatch++;
//                }
//
//                if (letterMatch == beginWord.length() - 1) {
//
//                }
//            }
//        }
//
//
//    }
}
