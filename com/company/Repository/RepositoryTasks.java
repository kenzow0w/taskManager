package com.company.Repository;

import com.company.Task;
import java.io.*;
import java.util.ArrayList;



/**
 * Репозитория для работы с задачами
 */
public final class RepositoryTasks {

@SuppressWarnings("unchecked")
    public static ArrayList<Task> read() {
        try {
            FileInputStream fis = new FileInputStream("Tasks.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Task> tasks = (ArrayList<Task>) ois.readObject();

            ois.close();
            fis.close();
            return tasks;
        } catch (Exception E) {
            return new ArrayList<>();
        }

    }


    /**
     * Записываем задачи в файл
     *
     * @param tasks задачи
     */
    public static void write(ArrayList<Task> tasks)
    {
        try{
            FileOutputStream fos = new FileOutputStream("Tasks.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(tasks);
            fos.close();
            oos.close();
        } catch (Exception E) {
            return;
        }


    }

}
