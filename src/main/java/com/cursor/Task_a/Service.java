package com.cursor.Task_a;

public class Service {
    Input input = new Input();
    boolean tryAgain = true;
    Messages messages = new Messages();

    public void makeChoice(List list) {
        while (tryAgain) {
            switch (input.inputChoice()) {
                case (0):
                    tryAgain = false;
                    break;
                case (1):
                    list.printAllWards();
                    break;
                case (2):
                    list.printAllWordsStartsFromS();
                    break;
                case (3):
                    list.printAllWordsLettersMoreThan5();
                    break;
                default:
                    messages.inputWrongParameterMessage();
            }
        }
    }
}