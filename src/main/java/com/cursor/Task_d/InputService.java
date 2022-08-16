package com.cursor.Task_d;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputService {
    Scanner scanner = new Scanner(System.in);
    Messages messages = new Messages();

    public int makeYourChoice() {
        int choice = 0;
        try {
            messages.firstMessage();
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            choice = 7;
        } finally {
            return choice;
        }
    }

    public String enterMonth() {
        messages.enterMonthMessage();
        return scanner.nextLine();
    }

    public String enterForContinue() {
        return scanner.nextLine();
    }
}