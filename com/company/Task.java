package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task implements Serializable {

    public int id;
    public String task;


    public Task(int id, String task) {
        this.id = id;
        this.task = task;
    }

    @Override
    public String toString() {
        return "Task{ id='" + id + "'\'" + ", task = " + task + '}';

    }


}
