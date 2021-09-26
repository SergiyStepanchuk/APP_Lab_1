package Task5;

import java.util.Random;

public class Task5
{
    public static final Random rand = new Random();

    public static void main(final String[] args)
    {
        final int n = 5;
        final int m = 8;
        final int maxNum = 100;

        final int[][] matrix = createAndFillMatrix(n, m, maxNum);
        final int[][] matrixT = transposeMatrix(matrix);

        // out
        final int max_num_length = String.valueOf(maxNum).length() + 1;

        System.out.format("Start matrix[%d][%d] - \n", matrix.length, matrix[0].length);
        printMatrix(matrix, max_num_length);
        System.out.format("Transposed matrix[%d][%d] - \n", matrixT.length, matrixT[0].length);
        printMatrix(matrixT, max_num_length);
    }

    public static int[][] createAndFillMatrix(final int n, final int m, final int max_num)
    {
        final int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rand.nextInt(max_num);
            }
        }
        return matrix;
    }

    public static void printMatrix(final int[][] matrix, final int maxNumLength)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.format("%" + maxNumLength + "d", matrix[i][j]);
            }
            System.out.print('\n');
        }
    }

    public static int[][] transposeMatrix(final int[][] matrix)
    {
        final int[][] matrixT = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrixT[j][i] = matrix[i][j];
            }
        }
        return matrixT;
    }
}
