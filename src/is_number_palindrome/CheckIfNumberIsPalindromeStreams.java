package is_number_palindrome;

import java.util.stream.IntStream;

public class CheckIfNumberIsPalindromeStreams {

    public static void main(String[] args) {
        System.out.println(isPalindrome(55455));
        System.out.println(isPalindrome(-121));
    }

    static Boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        String numberString = Integer.toString(number);

        // Use IntStream to check if the number reads the same backward and forward
        return IntStream.range(0, numberString.length() / 2)
                .allMatch(i -> numberString.charAt(i) == numberString.charAt(numberString.length() - 1 - i));
    }
}
