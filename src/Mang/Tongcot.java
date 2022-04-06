package Mang;

public class Tongcot {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {4, 6, 7, 5},
                {3, 4, 67, 3},
                {3, 5, 7, 8}
        };
        for (int j = 0; j < arr[0].length; j++) {
            int total = 0;
            for (int i = 0; i < arr.length; i++)
                total += arr[i][j];
            System.out.println("Sum for column " + j + " is "
                    + total);
        }
    }
}
