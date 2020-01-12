package topic2.two_arrays;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        String[] func = new String[]{"Поворот на 90 градусов", "Поворот на 180 градусов", "Поворот на 270 градусов"};
        int SIZE = 5;
        String input = "";
        int[][] matrixSize = new int[SIZE][SIZE];
        Random rand = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                matrixSize[i][j] = rand.nextInt(50);
            }
        }

        System.out.println("\tМатрица 8x8");
        print(matrixSize);
        while (true) {
            System.out.println();
            System.out.println("Операции над матрицой для выхода введите end:");

            for (int i = 0; i < func.length; i++) {
                System.out.printf("%d.\t%s\t\n", i + 1, func[i]);
            }
            Scanner text = new Scanner(System.in);
            input = text.nextLine();
          //  int copy[][]=
            if ("end".equals(input)) {
                System.out.println("Программа завершена");
                break;
            }
            try {
                int result = Integer.parseInt(input);
                switch (result) {
                    case 1: {
                        System.out.println("Результат:");
                        print(turn90(matrixSize));
                        System.out.println("-----------------------------------");
                        break;
                    }
                    case 2: {
                        System.out.println("Результат:");
                        print(turn180(matrixSize));
                        System.out.println("-----------------------------------");
                        break;
                    }
                    case 3: {
                        System.out.println("Результат:");
                        print(turn270(matrixSize));
                        System.out.println("-----------------------------------");
                        break;
                    } default:
                        System.out.println("Введите число от 1 до 3 или end для выхода");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите цело число\n");
            }

        }
    }
    static public void print(int[][] printMatrix) {
        for (int i = 0; i < printMatrix.length; i++) {
            for (int j = 0; j<printMatrix.length; j++) {
                System.out.format("%4d", printMatrix[i][j]);
            }
            System.out.println();
        }
    }


    public static int[][] turn90(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }
        return result;
    }

    public static int[][] turn180(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[i][j] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
            }
        }
        return result;
    }

    public static int[][] turn270(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[i][j] = matrix[matrix.length - 1 - i][j];
            }
        }
        return result;
    }
}

