import java.util.*;

public class MaximalRectangle {

    //Very Hard: Maximal Rectangle
    //Problem:
    //Given a 2D binary matrix filled with 0s and 1s, find the largest rectangle containing only 1s and return its area.
    //
    //Example:
    //
    //python
    //Copy code
    //Input: matrix = [
    //    ["1","0","1","0","0"],
    //    ["1","0","1","1","1"],
    //    ["1","1","1","1","1"],
    //    ["1","0","0","1","0"]
    //]
    //Output: 6
    //Constraints:
    //
    //1 <= rows, cols <= 200
    //matrix[i][j] is either "0" or "1".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the size of the 2D array (n x n): ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(2);
            }
        }

        System.out.println("Generated 2D Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();


        int maxArea = getMaxRectangleArea(array);
        System.out.println("Maximum rectangle area: " + maxArea);
    }

    // Function to calculate the maximum rectangle area in a 2D binary matrix
    public static int getMaxRectangleArea(int[][] matrix) {
        // If the matrix is empty or null, return 0 as there's no rectangle
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        // Get the number of rows and columns in the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create an array to store the heights of the histogram
        int[] heights = new int[cols];
        int maxArea = 0; // Variable to track the maximum rectangle area

        // Iterate through each row in the matrix
        for (int i = 0; i < rows; i++) {
            // Update the heights array based on the current row
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    heights[j] += 1; // Increment the height if the value is 1
                } else {
                    heights[j] = 0; // Reset the height to 0 if the value is 0
                }
            }

            // Calculate the maximum rectangle area for the current histogram
            maxArea = Math.max(maxArea, getMaxHistogramArea(heights));
        }

        return maxArea; // Return the maximum rectangle area
    }

    // Function to calculate the maximum area of a histogram
    private static int getMaxHistogramArea(int[] heights) {

        // Stack to keep track of indices of histogram bars
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0; // Variable to store the maximum area
        int n = heights.length; // Length of the histogram array

        // Iterate through the histogram (including an extra iteration for cleanup)
        for (int i = 0; i <= n; i++) {
            // Current height is 0 if we're at the end, otherwise heights[i]
            int currentHeight = (i == n) ? 0 : heights[i];

            // While the stack is not empty and currentHeight is less than the top of the stack
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                // Pop the top index from the stack and get its height
                int height = heights[stack.pop()];

                // Calculate the width of the rectangle
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;

                // Update the maximum area
                maxArea = Math.max(maxArea, height * width);
            }

            // Push the current index onto the stack
            stack.push(i);
        }

        return maxArea; // Return the maximum area of the histogram
    }
}

