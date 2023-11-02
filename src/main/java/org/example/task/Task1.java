package org.example.task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static  void numberGreaterThan7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1: Составить алгоритм: если введенное число больше 7, то вывести “Привет”");
        System.out.println("=======================================");
        System.out.println("Если вы хотите закончить цикл, напишите (n)");
        while (true) {
            System.out.print("Введите число: ");
            String input = scanner.nextLine();
            if (input.equals("n")) {
                System.out.println("Цикл остановлен");
                break;
            }
            try {
                int number = Integer.parseInt(input);
                if (number > 7) {
                    System.out.println("Hello");
                }
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Введите число или 'n' для выхода.");
            }
        }
        scanner.close();
    }
}
