package com.cursor.Task_a;

import java.util.Scanner;

public class Input {
    Messages messages = new Messages();
    Scanner scanner = new Scanner(System.in);

    public int inputChoice() {
        messages.inputChoiceMessage();
        return scanner.nextInt();
    }

    public String inputWords() {
        messages.inputWordsMessage();
        return scanner.nextLine();
    }
}