public class CountVowelsInAString {

    //Easy 2: Count Vowels in a String
    //Problem:
    //Write a function countVowels(s: str) -> int that counts the number of vowels in a string s.
    //
    //Example:
    //
    //python
    //Copy
    //Edit
    //Input: s = "hello world"
    //Output: 3
    //Constraints:
    //
    //1 <= len(s) <= 10^5

    public static void main(String[] args) {
        System.out.println(countVowels("smgjasohywaqn"));
        System.out.println(countVowels("hello world"));
    }

    static Integer countVowels(String word) {
        int counter = 0;

        for (Character ch : word.toCharArray()) {
            if (ch.toString().matches("[aeiouAEIOU]+")) {
                counter++;
            }
        }
        return counter;
    }
}
