import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateMatrix {

    //Medium 1: Rotate Matrix
    //Problem:
    //Write a function rotate(matrix: List[List[int]]) -> None that rotates an n x n 2D matrix clockwise by 90 degrees in place.
    //
    //Example:
    //
    //python
    //Copy
    //Edit
    //Input: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    //Output: [[7, 4, 1], [8, 5, 2], [9, 6, 3]]
    //[1, 2, 3]
    //[4, 5, 6]
    //[7, 8, 9]
    //--->
    //[7, 4, 1]
    //[8, 5, 2]
    //[9, 6, 3]
    //Constraints:
    //
    //1 <= n <= 100

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        System.out.println("Original Matrix:");
        matrix.forEach(System.out::println);

        rotate(matrix);

        System.out.println("\nRotated Matrix:");
        matrix.forEach(System.out::println);
    }

    static void rotate(List<List<Integer>> matrix) {
        int n = matrix.size();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix.get(i).get(j);
                matrix.get(i).set(j, matrix.get(j).get(i));
                matrix.get(j).set(i, temp);
            }
        }

        for (List<Integer> row : matrix) {
            Collections.reverse(row);
        }
    }

    //Explanation:
    //Transpose:
    //Swap matrix[i][j] with matrix[j][i] for i < j, converting rows into columns.
    //Reverse each row:
    //Since the transposed matrix is still a reflection of the rotated matrix,
    // reversing the rows gives the correct 90-degree rotation.
    //Example:
    //Input Matrix
    //1  2  3
    //4  5  6
    //7  8  9
    //After Transposition
    //1  4  7
    //2  5  8
    //3  6  9
    //After Reversing Each Row
    //7  4  1
    //8  5  2
    //9  6  3
}
