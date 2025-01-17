import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArrays {

    //Easy 1: Merge Two Sorted Arrays
    //Problem:
    //Write a function merge(arr1: List[int], arr2: List[int]) -> List[int] to merge two sorted arrays into one sorted array.
    //
    //Example:
    //
    //python
    //Copy code
    //Input: arr1 = [1, 3, 5], arr2 = [2, 4, 6]
    //Output: [1, 2, 3, 4, 5, 6]
    //Constraints:
    //
    //1 <= len(arr1), len(arr2) <= 1000

    public static void main(String[] args) {
        System.out.println(sortAndMergeArrays(new int[]{6, 10, 12}, new int[]{5, 3, 17}));
    }

    static List<Integer> sortAndMergeArrays(int[] array, int[] array2) {
        //Using insertion sort
        List<Integer> mergedList = new ArrayList<>();

        int[] sortedArr = Arrays.stream(array)
                .sorted()
                .toArray();
        int[] sortedArr2 = Arrays.stream(array2)
                .sorted()
                .toArray();

        for (int number : sortedArr) {
            mergedList.add(number);
        }
        for (int number : sortedArr2) {
            mergedList.add(number);
        }

        // Perform insertion sort on the ArrayList
        for (int i = 1; i < mergedList.size(); i++) {
            // Store the current element (key) to be inserted into the sorted portion
            int key = mergedList.get(i);

            // Find the position in the sorted portion (index < i) where 'key' fits
            int j = i - 1;

            // Shift elements in the sorted portion to the right to make space for 'key'
            while (j >= 0 && mergedList.get(j) > key) {
                // Shift element one position to the right
                mergedList.set(j + 1, mergedList.get(j));
                j--; // Move to the previous element
            }

            // Insert the 'key' at its correct position
            mergedList.set(j + 1, key);
        }
        return mergedList;
    }
}

