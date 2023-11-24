// import java.util.*;
// public class Matrices {
//     public static void main(String args[]) {
//         int matrix [] [] = new int[3] [3];
//         int n = matrix.length, m = matrix[0].length;

//         Scanner sc = new Scanner(System.in);
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         //Output
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 System.out.print(matrix [i] [j] + " ");
//             }
//             System.out.println();
//         }
//     }

// }




//searching for the  number.
// import java.util.*;
// public class Matrices {
//     public static void main(String args[]) {
//         int matrix [] [] = new int[3] [3];
//         int n = matrix.length, m = matrix[0].length;

//         Scanner sc = new Scanner(System.in);
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         //Output
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<m; j++) {
//                 System.out.print(matrix [i] [j] + " ");
//             }
//             System.out.println();
//         }
//     }

// }








//PRINTING THE SPIRAL NUMBER .
// public class Matrices {
//     public static void printSpiral(int matrix[][]) {
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length - 1;
//         int endCol = matrix[0].length - 1;

//         while (startRow <= endRow && startCol <= endCol) {
//             // TOP
//             for (int j = startCol; j <= endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }

//             // RIGHT
//             for (int i = startRow + 1; i <= endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " ");
//             }

//             // BOTTOM
//             if (startRow < endRow) {
//                 for (int j = endCol - 1; j >= startCol; j--) {
//                     if(startCol == endRow) {
//                         break;
//                     }
//                     System.out.print(matrix[endRow][j] + " ");
//                 }
//             }

//             // LEFT
//             if (startCol < endCol) {
//                 for (int i = endRow - 1; i > startRow; i--) {
//                     if(startCol == endCol) {
//                         break;
//                     }
//                     System.out.print(matrix[i][startCol] + " ");
//                 }
//             }

//             startCol++;
//             startRow++;
//             endCol--;
//             endRow--;
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int matrix[][] = {{1, 2, 3, 4},
//                           {5, 6, 7, 8},
//                           {9, 10, 11, 12}, 
//                           {13, 14, 15, 16}};

//         printSpiral(matrix);
//     }
// }





//DAIGNOL SUM 
// import java.util.*;
// public class Matrices{
//     public static int diagonalSum(int matrix[][]) {
//         int sum = 0;

//         //TIME COMPLEXITY 0(n2)
//         // for(int i=0; i<matrix.length; i++) {
//         //     for(int j=0; j<matrix[0].length; j++) {
//         //         if(i == j) {
//         //             sum += matrix[i][j];
//         //         }
//         //         else if(i+j == matrix.length-1) {
//         //             sum += matrix[i][j];
//         //         }
//         //     }
//         // }

//         //TIME COMPLEXITY O(N)
//         for(int i=0; i<matrix.length; i++) {
//             //Primary daignoaol
//             sum += matrix[i][i];
//             //Secondary Daignoal
//             if(i != matrix.length-1-i)
//                 sum += matrix[i][matrix.length-i-1];

//         }
//         return sum;
//     }
//     public static void main(String args[]) {
//         int matrix[][] = {{1, 2, 3, 4},
//                           {5, 6, 7, 8},
//                           {9, 10, 11, 12}, 
//                           {13, 14, 15, 16}};
//         System.out.println(diagonalSum(matrix));

//     }
// }










// public class Matrices {
//     public static boolean staircaseSearch(int matrix[][], int key) {
//         int row = 0, col = matrix[0].length - 1;

//         while (row < matrix.length && col >= 0) {
//             if (matrix[row][col] == key) {
//                 System.out.println("Found key at (" + row + "," + col + ")");
//                 return true;
//             } else if (key < matrix[row][col]) {
//                 col--;
//             } else {
//                 row++;
//             }
//         }

//         System.out.println("Key not found");
//         return false;
//     }

//     public static void main(String args[]) {
//         int matrix[][] = {{1, 2, 3, 4},
//                           {5, 6, 7, 8},
//                           {9, 10, 11, 12},
//                           {13, 14, 15, 16}};
//         int key = 13;

//         staircaseSearch(matrix, key);
//     }
// }


public class Matrices {
    public static void main(String[] args) {
        // Original matrix (2x3)
        int originalMatrix[][] = {{1, 2, 3},
                                  {4, 5, 6}};

        // Finding the transpose
        int rows = originalMatrix.length;
        int cols = originalMatrix[0].length;

        int transposeMatrix[][] = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = originalMatrix[i][j];
            }
        }

        // Displaying the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(originalMatrix);

        // Displaying the transpose matrix
        System.out.println("\nTranspose Matrix:");
        displayMatrix(transposeMatrix);
    }

    // Helper method to display a matrix
    public static void displayMatrix(int matrix[][]) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
