/**
 * Created by tolik on 26.12.2016.
 */

/*4. Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).*/

public class Array {
    public static void main(String[] args) {
        int[] list = new int[50];
        for (int i = 0; i < list.length; i++) {
            list[i] = i * 2 + 1; //число в ячейке больше номера ячейки в 2 раза + 1
        }

        for (int i = 0; i < list.length; i++) {  // от 1 до 99
            System.out.print(list[i] + " ");
        }

        System.out.println("");

        for (int i = list.length - 1; i >= 0; i--) {  // от 1 до 99
            System.out.print(list[i] + " ");
        }
    }
}
