/**
 * Created by tolik on 26.12.2016.
 */
//1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
//3. Перепишите программы с использованием цикла while.
public class PrintOdds {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {               //задание 1
            if (i % 2 != 0) System.out.print(i + " ");
        }

        System.out.println("");

        int i = 0;
        while (i < 100) {                     //задание 1 + 3
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
