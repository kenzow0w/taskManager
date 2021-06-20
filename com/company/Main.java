package com.company;

import com.company.View.Menu;

import java.util.Scanner;
/**
 * Планировщик задач.
 * @author Володин Владислав
 * @version 16
 */


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean start = Menu.start(scanner);
            if (!start)
                break;
        }


    }
}



