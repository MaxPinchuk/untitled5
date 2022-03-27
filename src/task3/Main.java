package task3;

/**
 * Применить на практике автоматическое преобразование, но с потерей точности: int -> float.
 * 1. Проинициализировать переменную типа int максимальным значением
 * 2. Присвоить ее значение переменной типа float.
 * 3. Вывести оба числа на экран.
 */

public class Main {

    public static void main(String[] args) {
        int a = 2147483647;
        float b = a;
        System.out.println(a);
        System.out.println(b);
    }
}