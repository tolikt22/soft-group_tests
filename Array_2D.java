/**
 * Created by tolik on 26.12.2016.
 */

/*6. Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка *10;99+.
Вывести массив на экран.*/

public class Array_2D {
    public static void main(String[] args) {
        int[][] listW = new int[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                listW[i][j] = (int) (Math.random() * 90 + 10);
                System.out.print(listW[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < listW.length; i++) {
            for (int j = 0; j < listW[i].length; j++) {
                System.out.print(listW[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
