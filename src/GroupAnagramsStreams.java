import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagramsStreams {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(Arrays.asList("tea", "ate", "bat", "tab", "cat", "act")));
    }

    static List<List<String>> groupAnagrams(List<String> strings) {
        Map<String, List<String>> anagramGroups = strings.stream()
                .collect(Collectors.groupingBy(str -> {
                    char[] charArray = str.toCharArray();
                    Arrays.sort(charArray);
                    return new String(charArray);
                }));

        return new ArrayList<>(anagramGroups.values());
    }
}
