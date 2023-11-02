package org.example.task;

import java.util.Scanner;

public class Task2 {
    public static void checkIsVyacheslav() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 2: Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести \"Нет такого имени\"");
        System.out.println("=======================================");
        System.out.println("Если вы хотите закончить цикл, напишите (n)");
        while (true) {
            System.out.print("Введите имя: ");
            String input = scanner.nextLine();
            if (input.equals("n")) {
                System.out.println("Цикл остановлен");
                break;
            }

            if (containsOnlyLetters(input)) {
                if (input.equals("Вячеслав")) {
                    System.out.println("Привет, " + input);
                } else {
                    System.out.println("Нет такого имени");
                }
            } else {
                System.out.println("Введите корректное имя (только буквы)");
            }
        }
        scanner.close();
    }
    private static boolean containsOnlyLetters(String input) {
        return input.matches("[а-яА-Я]+");
    }
}
