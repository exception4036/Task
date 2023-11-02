package org.example.main;

import org.example.task.Task1;
import org.example.task.Task2;
import org.example.task.Task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание (1, 2 или 3):");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Task1.numberGreaterThan7();
                break;
            case 2:
                Task2.checkIsVyacheslav();
                break;
            case 3:
                int[] array = Task3.generate();
                Task3.printElementsBy3(array);
                break;
            default:
                System.out.println("Некорректный выбор задания.");
                break;
        }
        scanner.close();
    }
}