import java.security.SecureRandom;
import java.util.*;
import java.util.random.RandomGenerator;

public class GenerateParantheses {

    //Medium 2: Generate Parentheses
    //Problem:
    //Write a function generateParentheses(n: int) -> List[str] to generate all valid combinations of n pairs of parentheses.
    //
    //Example:
    //
    //python
    //Copy
    //Edit
    //Input: n = 3
    //Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]
    //Constraints:
    //
    //1 <= n <= 8

    public static void main(String[] args) {
        generateParentheses(3);
        generateParentheses(4);
        generateParentheses(5);
    }

    static List<String> generateParentheses(int number) {
        if (!(number >= 1 && number <= 8)) {
            return List.of("Invalid number input, must be between 1 and 8");
        }

        String allowedCharacters = "()";
        SecureRandom RANDOM = new SecureRandom();
        Set<String> setOfParentheses = new HashSet<>();
        List<Character> lastBuiltString = new ArrayList<>();
        int leftCounter = 0, rightCounter = 0;
        int totalPairs = number * 2;

        for (int i = 0; i < totalPairs; i++) {
            char[] charArray = allowedCharacters.toCharArray();
            char randomChar = charArray[RANDOM.nextInt(allowedCharacters.length())];

            // Ensure parentheses stay balanced
            if (randomChar == '(' && leftCounter < number) {
                lastBuiltString.add(randomChar);
                leftCounter++;
            } else if (randomChar == ')' && rightCounter < leftCounter) {
                lastBuiltString.add(randomChar);
                rightCounter++;
            } else {
                i--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : lastBuiltString) {
            sb.append(c);
        }
        setOfParentheses.add(sb.toString());

        return new ArrayList<>(setOfParentheses);
    }
}
