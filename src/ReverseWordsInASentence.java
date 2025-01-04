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

        System.out.println("You entered: " + input);

        scanner.close();
    }
}
