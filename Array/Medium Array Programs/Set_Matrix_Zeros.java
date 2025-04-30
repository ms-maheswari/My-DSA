//  If an element is 0, set its entire row and column to 0's

public class Set_Matrix_Zeros {
    public static void setZeroes(int[][] matrix) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        int[] row = new int[rowLength];
        int[] col = new int[colLength];

        // Iterate the matrix to find the zeroes position in the matrix
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Iterate the matrix to set zeroes in the identified matrix position
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setZeroes(matrix);

        // Print the modified matrix
        for (int i = 0; i < matrix.length; i++) // "matrix.length" gives the number of rows
        {
            for (int j = 0; j < matrix[0].length; j++) //"matrix[0].length" gives the number of columns 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }   
}

// Input : [[1,1,1],[1,0,1],[1,1,1]]
// Output : [[1,0,1],[0,0,0],[1,0,1]]
