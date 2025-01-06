import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsInASentence {

     /*
        Easy: Reverse Words in a Sentence
        Problem:
        Write a function reverseWords(sentence: str) -> str that takes a string sentence as input and returns a
        new string where the words are reversed, but the order of the characters within each word remains the same.
        Words are separated by a single space.

        Example:

        python
        Copy code
        Input: "Hello World from LeetCode"
        Output: "LeetCode from World Hello"

        Constraints:
        1 <= len(sentence) <= 10^4
        sentence contains only English letters and spaces, and it has no leading or trailing spaces.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        List<String> wordsAsList = new ArrayList<>();
        String currentWord = "";

        for (int i = 0; i < input.trim().length(); i++) {
            String currentChar = String.valueOf(input.trim().charAt(i));

            if (currentChar.matches("\\s")) {
                if (!currentWord.isEmpty()) {
                    //this if condition IS necessary as when we have consecutive whitespace it will save it in the
                    //arrayList and we want to avoid that
                    wordsAsList.add(currentWord);
                    currentWord = "";
                }
            } else {
                currentWord = "%s%s".formatted(currentWord, currentChar);
            }

            // If this is the last character of the string, add the final word
            if (i == input.trim().length() - 1 && !currentWord.isEmpty()) {
                wordsAsList.add(currentWord);
            }
        }

       /* Wrong solution(need it as a reminder) :
          for (int i = 0; i <= input.trim().length() - 1; i++) {
                    String currentChar = String.valueOf(input.trim().charAt(i));
                    if(currentChar.matches("\s") || i == input.trim().length() - 1){
                        wordsAsList.add(currentWord);
                        currentWord = "";
                    }
                    currentWord = "%s%s".formatted(currentWord, currentChar);
                }*/

        List<String> reversedWords = new ArrayList<>();
        for (int i = wordsAsList.size() - 1; i >= 0; i--) {
            reversedWords.add(wordsAsList.get(i));
        }

        String result = String.join(" ", reversedWords);
        System.out.println("Your string reversed: " + result);


        scanner.close();
    }
}
