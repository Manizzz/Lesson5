import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task7
        {
            System.out.println("Задание №7");
            System.out.print("Введите размерность массива: ");
            int input = scanner.nextInt();
            int[] array = new int[input];
            for (int i = 0; i < array.length; i++) {
                System.out.print("Введите число для заполнения массива: ");
                array[i] = scanner.nextInt();
            }
            System.out.print("Вывод элементов массива:{ ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.print(" }");
        }

        //task8
        {
            System.out.println(" ");
            System.out.println("Задание №8");
            int[][] array2D;
            System.out.print("Введите количество строк массива: ");
            int input = scanner.nextInt();
            System.out.print("Введите количество столбцов массива: ");
            int input1 = scanner.nextInt();
            array2D = new int[input][input1];
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    System.out.print("Введите число для заполнения массива: ");
                    array2D[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Вывод элементов массива");
            for (int[] array : array2D) {
                for (int num : array) {
                    System.out.print(num + " ");
                }
                System.out.println(" ");
            }
        }

        //task9
        {
            System.out.println("Задание №9");
            int a = 0;
            if (args.length == 0) {
                System.out.print("Аргументы не введены!");
            } else {
                for (String str : args) {
                    a += Integer.parseInt(str);
                }
                System.out.println("Сумма аргументов равна " + a);
            }
        }

        //task10
        {
            System.out.println("Задание №10");
            System.out.print("Введите количество строк массива: ");
            int inputRow = scanner.nextInt();
            System.out.print("Введите количество столбцов массива: ");
            int inputCol = scanner.nextInt();
            int[][] array2D = new int[inputRow][inputCol];
            int num = 0;
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    if (j == 0) {
                        num = i + 1;
                    } else {
                        num = num + array2D.length;
                    }
                    array2D[i][j] = num;
                }
            }
            for (int[] array : array2D) {
                for (int arr : array) {
                    System.out.print(arr + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
