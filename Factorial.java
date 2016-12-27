/**
 * Created by tolik on 26.12.2016.
 */
/*
2. Дано число n. При помощи цикла for посчитать факториал n!
Примечание. Факториал числа n - произведение всех натуральных чисел от 1 до n включительно.
Например, 5! = 1х2х3х4х5 = 120
3. Перепишите программы с использованием цикла while.*/

public class Factorial {
    public static void main(String[] args) {
//        int n = 6;                         //задание 2 справа налево
//        int result = 0;
//        int limit = n;
//        for (int i = 1; i < limit; i++) {
//            int x=limit;
//            result = n * (x - i);
//            n = result;

//        int n = 6;                           //задание 2 слева направо
//        int res = 0;
//        int current = 1;
//        for (int i = 1; i < n; i++) {
//            res = current * (i + 1);
//            current = res;
//        }
//        System.out.println(res);

        int n = 6;                             //задание 2 слева направо (через while)
        int i = 0;
        int res = 0;
        int current = 1;
        while (i < n) {
            res = current * (i + 1);
            current = res;
            i++;
        }
        System.out.println(res);
    }
}


