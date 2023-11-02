package org.example.task;

import java.util.Scanner;

public class Task3 {
    public static void printElementsBy3(int array[]){
        if (array == null) {
            System.out.println("Массив не должен быть null.");
            return;
        }

        if (array.length == 0) {
            System.out.println("Массив пуст.");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println("Индекс: "+ i + " Элемент: " + array[i]);
            }
        }
    }
    public static int[] generate(){
        System.out.println("Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3");
        System.out.println("=======================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
