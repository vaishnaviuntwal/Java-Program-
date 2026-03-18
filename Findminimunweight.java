import java.util.Scanner;

public class Findminimunweight {
     static int rows;
    static int cols;

    public static int findMinimumWeight(int[][] maze, int row, int col, int currentWeight) {

        currentWeight = Math.max(currentWeight, maze[row][col]);

        if (row == rows - 1 && col == cols - 1) {
            return currentWeight;
        }

        int rightPath = Integer.MAX_VALUE;
        int downPath = Integer.MAX_VALUE;

        if (col + 1 < cols) {
            rightPath = findMinimumWeight(maze, row, col + 1, currentWeight);
        }

        if (row + 1 < rows) {
            downPath = findMinimumWeight(maze, row + 1, col, currentWeight);
        }

        return Math.min(rightPath, downPath);
    }

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        rows = inputScanner.nextInt();
        cols = rows;

        int[][] maze = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maze[i][j] = inputScanner.nextInt();
            }
        }

        int result = findMinimumWeight(maze, 0, 0, 1);

        System.out.println(result);

        inputScanner.close();
    }
}

    

