package MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int [][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }

        int row= rows-1;
        int col = cols-1;



            int r = rows-1;
            int c = col-1;

        System.out.print(matrix[r][c]+ " ");


            }
        }
