public class CheckIfNumberIsPalindrome {

    //Very Easy: Check if a Number is Palindrome
    //Problem:
    //Write a function isPalindrome(x: int) -> bool to check if an integer x is a palindrome (reads the same backward as forward).
    //
    //Example:
    //
    //python
    //Copy code
    //Input: x = 121
    //Output: True
    //
    //Input: x = -121
    //Output: False
    //Constraints:
    //
    //-2^31 <= x <= 2^31 - 1

    public static void main(String[] args) {
        System.out.println(isPalindrome(55455));
        System.out.println(isPalindrome(-121));
    }

    static Boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        } else if (number == 0) {
            return true;
        }
        String numberString = Integer.toString(number);
        int[] digits = new int[numberString.length()];

        for (int i = numberString.length() - 1; i >= 0; i--) {
            digits[numberString.length() - 1 - i] = Character.getNumericValue(numberString.charAt(i));
            //so the formula, no matter if the for loop os going forwards or backwards,
            // is ArrayOfNumber[string.length() - 1 - i]
            //for (int i = 0; i < numberString.length(); i++) {
            //    digits[numberString.length() - 1 - i] = Character.getNumericValue(numberString.charAt(i));
            //}
        }

        int numberPalindrome = 0;
        for (int digit : digits) {
            numberPalindrome = numberPalindrome * 10 + digit;
        }

        return number == numberPalindrome;
    }
}
