package com.company.View;

import com.company.Task;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;


public final class Menu {
    public static boolean start(Scanner scanner) {
        Scanner scanner2 = new Scanner(System.in);
        int switchCase;
        System.out.println("Список задач:");
        do {
            System.out.println("Выбери действие");
            System.out.println("1. Вывести список задач из файла");
            System.out.println("2. Добавить задачу");
            System.out.println("3. Редактировать описание задачи");
            System.out.println("4. Удаление задачи");
            System.out.println("5. Выход из программы");
            switchCase = scanner.nextInt();
            Task inputTask;
            switch (switchCase) {
                case 1:
                    Actions.showTasks();
                    break;
                case 2:
                    inputTask = getTask();
                    Actions.addTask(inputTask);
                    break;
                case 3:
                    Actions.edditTasks();
                    break;
                case 4:
                    Actions.removeTasks();
                    break;
                case 5:
                    System.out.println("Завершение процесса...");
                    return false;
                default:
                    System.out.println("Некорректный ввод, попробуйте еще раз");
                    break;
            }
            System.out.println("Нажмите Enter для возвращения в меню");
            scanner2.nextLine();
        } while (true);
    }

    /**
     * Создать описание задачи
     */
    public static Task getTask() {
        Scanner scanner = new Scanner (System.in);
        String task;
        System.out.println("Введите номер задачи");
        int id = scanner.nextInt();
        System.out.println("Введите описание задачи");
        task = scanner.next();
        return new Task(id, task);
    }
}


