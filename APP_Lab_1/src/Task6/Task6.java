package Task6;

public class Task6
{
    public static void main(final String[] args)
    {
        final int maxNumLength = 3;
        final int[][] matrix_1 = {
                {1, 3, 5},
                {2, 3, 8},
                {1, 2, 2}
        };

        final int[][] matrix_2 = {
                {6, 6, 8},
                {1, 5, 2},
                {8, 4, 3}
        };

        final int[][] matrix_out = multiplyMatrix(matrix_1, matrix_2);

        // out
        System.out.format("matrix_1[%d][%d] - \n", matrix_1.length, matrix_1[0].length);
        printMatrix(matrix_1, maxNumLength);

        System.out.format("matrix_2[%d][%d] - \n", matrix_2.length, matrix_2[0].length);
        printMatrix(matrix_2, maxNumLength);

        if (matrix_out != null)
        {
            System.out.format("matrix_out[%d][%d] - \n", matrix_out.length, matrix_out[0].length);
            printMatrix(matrix_out, maxNumLength);
        }
        else
            System.out.println("Matrix multiplication is not possible");
    }

    public static int[][] multiplyMatrix(final int[][] m1, final int[][] m2) {
        final int m1ColLength = m1[0].length; // m1 columns length
        final int m2RowLength = m2.length;    // m2 rows length
        if(m1ColLength != m2RowLength) return null; // matrix multiplication is not possible
        final int mRRowLength = m1.length;    // m result rows length
        final int mRColLength = m2[0].length; // m result columns length
        final int[][] mResult = new int[mRRowLength][mRColLength];
        for(int i = 0; i < mRRowLength; i++) {         // rows from m1
            for(int j = 0; j < mRColLength; j++) {     // columns from m2
                for(int k = 0; k < m1ColLength; k++) { // columns from m1
                    mResult[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return mResult;
    }

    public static void printMatrix(final int[][] matrix, final int max_num_length)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.format("%" + max_num_length + "d", matrix[i][j]);
            }
            System.out.print('\n');
        }
    }
}
