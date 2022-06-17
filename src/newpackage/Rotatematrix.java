public class Rotatematrix {
    public static void main(String [] args){
        int [][] userMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatrix(userMatrix);
        System.out.println('\n');

        int [][] transposedMatrix = transposeMatrix(userMatrix);
        printMatrix(transposedMatrix);
        System.out.println('\n');

        int [][] finalResult = finalStep(transposedMatrix);
        printMatrix(finalResult);
        System.out.println('\n');

    }
    public static int[][] transposeMatrix(int [][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;
        for (int i = 0; i < row; i++){
            for (int j = i; j < column; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
    public static int [][] finalStep(int [][] transposedMatrix){
        int [][] nums = transposedMatrix;
        int row = nums.length;
        int column = nums[0].length;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column/2; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[i][column - 1 - j];
                nums[i][column - 1 - j] = temp;
            }
        }
        return nums;
    }
    public static void printMatrix(int [][] nums){
        for (int [] i : nums){
            for (int j : i ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
