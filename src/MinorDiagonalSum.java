import java.util.Scanner;

public class MinorDiagonalSum {
    static int findMinorDiagonalSum(int[][] matrix, int rows, int cols){
        int sum =0, j = rows-1;
        for (int i = 0; i < rows; i++){
            sum+=matrix[i][j];
            j--;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j< cols; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(findMinorDiagonalSum(matrix, rows, cols));
    }
}
