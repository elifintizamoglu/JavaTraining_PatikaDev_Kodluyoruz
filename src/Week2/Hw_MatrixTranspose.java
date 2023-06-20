package Week2;

public class Hw_MatrixTranspose {
    public static void main(String[] args) {

        // This piece of code takes a matrix, transpose it, and print both matrix

        // Firstly, define main matrix and transpose matrix
        // Main matrix's row number should be transpose matrix's column number
        // Main matrix's column number should be transpose matrix's row number
        // That is why we wrote =>  int[][] transpose = new int[matrix[0].length][matrix.length];

        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] transpose = new int[matrix[0].length][matrix.length];

        // Print main matrix

        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose the matrix
        // Element in index matrix[1][2], should be in transpose[2][1]
        // That is why I write j instead of i and, i instead of j
        // in this code => transpose[j][i] = matrix[i][j];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transpose matrix

        System.out.println("Transpose: ");
        for (int[] row: transpose) {
            for (int column: row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
