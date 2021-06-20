package com.company.TEst;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Task task = Task.getTask();
        System.out.println(task);


    }


    static class Task {
        protected int id;
        public String task;


        public Task(int id, String task) {
            this.id = id;
            this.task = task;
        }


        public static Task getTask() {
            Scanner scanner = new Scanner(System.in);
            String task;
            int id;
            System.out.println("Введите номер задачи");
            id = scanner.nextInt();
            System.out.println("Введите описание задачи");
            task = scanner.next();




            return new Task(id, task);

        }


        @Override
        public String toString() {
            return "Task{ id='" + id + " '\'" + ", task = " + task + '}';

        }


    }


}
