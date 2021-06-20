package com.company.View;

import com.company.Repository.RepositoryTasks;
import com.company.Task;

import java.util.ArrayList;
import java.util.Scanner;

public final class Actions {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Добавление новой задачи
     *
     * @param inputTask новая задача
     */
    public static void addTask(Task inputTask) {
        ArrayList<Task> tasks = RepositoryTasks.read();
        for (Task tmp : tasks) {
            if (tmp.task.equals(inputTask.task)) {
                System.out.println("Ошибка: Такая задача уже существует!");
                System.out.println("Совет: Придумайте другую задачу и попробуйте сново!");
                return;
            }
        }
        tasks.add(inputTask);
        RepositoryTasks.write(tasks);
        System.out.println("Задача под номером  " + inputTask.id + " записана!!");
    }

    /**
     * Вывести список задач из файла
     */
    public static void showTasks() {
        ArrayList<Task> tasks = RepositoryTasks.read();
        if (tasks.isEmpty()) {
            System.out.println("Список дел пуст!");
        } else {
            for (Task tmp : tasks) {
                System.out.println(tmp);
            }
        }
    }

    /**
     * Редактировать описание задачи
     */
    public static int edditTasks() {
        ArrayList<Task> tasks = RepositoryTasks.read();
        if (tasks.isEmpty()) {
            System.out.println("Список дел пуст!");
            return 1;
        }
            for (Task tmp : tasks) {
                System.out.println(tmp);
            }
        System.out.println("Выберите номер задачи для редактирования");
        int switchCase = scanner.nextInt();

        for (Task tmp : tasks) {
            if (switchCase == tmp.id) {
                System.out.println("Введите новую задачу");
                tmp.task = scanner.next();
            }
            System.out.println("Задача под номером  " + tmp.id + " откорректирована!!");
            RepositoryTasks.write(tasks);
            return 0;
        }
        if (switchCase != 0)
            System.out.println("Задачи с таким номером не существует");

        return switchCase;

    }


    /**
     * Удаление задачи
     */
    public static int removeTasks() {
        ArrayList<Task> tasks = RepositoryTasks.read();
        if (tasks.isEmpty()) {
            System.out.println("Список дел пуст!");
            return 1;
        }
        for (Task tmp : tasks) {
            System.out.println(tmp);
        }
        System.out.println("Выберите номер задачи для удаления");
        int switchCase = scanner.nextInt();

        for (Task tmp : tasks) {
            if (switchCase == tmp.id) {
                System.out.println("Задача под номером  " + tmp.id + " была удалена!!");
                tasks.remove(tmp);
                RepositoryTasks.write(tasks);
                return 0;
            }
        }
        if (switchCase != 0)
            System.out.println("Задачи с таким номером не существует");
        return switchCase;
    }
}

