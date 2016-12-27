/**
 * Created by tolik on 26.12.2016.
 */

/*5. Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
Напоминаем, что первый и второй члены последовательности равны единицам,
а каждый следующий — сумме двух предыдущих.*/

public class Fibonacci {
    public static void main(String[] args) {
        int a = 1, b = 1, c;
        int[] fibList = new int[20];
        fibList[0] = a;
        fibList[1] = b;

        for (int i = 2; i < fibList.length; i++) {
            c = a + b;
            fibList[i] = c;
            a = b;
            b = c;
        }

        for (int i = 0; i < fibList.length; i++) {
            System.out.print(fibList[i] + " ");
        }
    }
}
