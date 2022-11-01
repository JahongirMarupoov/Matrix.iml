package examples1;

public class Example15 {
    public static void main(String[] args) {
        int[][] matrix = solution2(10);
        System.out.println("Natija: ");
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

    }

    // 0<= k < m
    public static int[][] solution(int n) {
        int[][] matrix = new int[n][n];
        int x = 0, y = 0;
        int number = 1;
        while (number <= n * n) {

            matrix[x][y] = number++;
        }

        return matrix;
    }


    /**
     * 2-usul
     * 4 siklda bajariladi
     * <p>
     * 1-sikl chapdan o'ngga
     * 2-sikl yuqoridan pastga
     * 3-sikl o'ngdan chapga
     * 4-sikl pastdan yuqoriga
     * <p>
     * har bir siklda agar number > n^2 bo'lsa return matrix bajariladi
     **/
    public static int[][] solution2(int n) {
        int[][] matrix = new int[n][n];
        int number = 1;

        int xalqa = 0;

        int counter = 0;
        while (number <= n * n) {
            // 0-xalqa 1-sikl chapdan o'ngga
            for (int i = xalqa; i < n - xalqa; i++) {
                counter++;
                if (number > n * n) return matrix;
                matrix[xalqa][i] = number++;
            }
            // 0-xalqa 2-sikl yuqoridan pastga
            for (int i = xalqa + 1; i <= n - (xalqa + 1); i++) {
                counter++;
                if (number > n * n) return matrix;
                matrix[i][n - (xalqa + 1)] = number++;
            }
            // xalqa = 0  3-sikl o'ngdan chapga
            for (int i = n - (xalqa + 2); i >= xalqa; i--) {
                counter++;
                if (number > n * n) return matrix;
                matrix[n - (xalqa + 1)][i] = number++;
            }
            // xalqa = 0 4-sikl pastdan yuqoriga
            for (int i = n - (xalqa + 2); i >= xalqa + 1; i--) {
                counter++;
                if (number > n * n) return matrix;
                matrix[i][xalqa] = number++;
            }
            xalqa++;
        }
        System.out.println("Count: " + counter);
        return matrix;
    }
}
