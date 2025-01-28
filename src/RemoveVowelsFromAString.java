public class RemoveVowelsFromAString {

    //Easy 1: Remove Vowels from a String
    //Problem:
    //Write a function removeVowels(s: str) -> str to remove all vowels from a string.
    //
    //Example:
    //
    //python
    //Copy
    //Edit
    //Input: s = "leetcodeisawesome"
    //Output: "ltcdsmwsm"
    //Constraints:
    //
    //1 <= len(s) <= 10^5
    //The string contains only lowercase English letters.

    public static void main(String[] args) {
        System.out.println(removeVowels("leetcodeisawesome"));
    }

    static String removeVowels(String str) {
        if(!str.matches("[a-z]+")){
            return "The String DOES NOT contain only lowercase letters";
        }

        StringBuffer stringWithoutVowels = new StringBuffer();

        for (Character ch : str.toCharArray()) {
            if (ch.toString().matches("[^aeiou]+")) {
                stringWithoutVowels.append(ch);
            }
        }

        return stringWithoutVowels.toString();
    }
}
