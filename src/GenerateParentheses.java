import java.security.SecureRandom;
import java.util.*;

public class GenerateParentheses {

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
        System.out.println(generateParentheses(3));
        System.out.println(generateParentheses(4));
        System.out.println(generateParentheses(9));

    }

    static List<String> generateParentheses(int number) {
        if (!(number >= 1 && number <= 8)) {
            return List.of("Invalid number input, must be between 1 and 8");
        }

        String allowedCharacters = "()";
        SecureRandom RANDOM = new SecureRandom();
        Set<String> setOfParentheses = new HashSet<>();

        while (setOfParentheses.size() < countValidCombinations(number)) {
            List<Character> lastBuiltString = new ArrayList<>();
            int leftCounter = 0, rightCounter = 0;
            int totalPairs = number * 2;

            for (int i = 0; i < totalPairs; i++) {
                char[] charArray = allowedCharacters.toCharArray();
                char randomChar = charArray[RANDOM.nextInt(allowedCharacters.length())];

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
        }

        return new ArrayList<>(setOfParentheses);
    }

    private static int countValidCombinations(int n) {
        int[] catalan = new int[n + 1];
        catalan[0] = 1;
        for (int i = 1; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - 1 - j];
            }
        }
        return catalan[n];
    }
}
