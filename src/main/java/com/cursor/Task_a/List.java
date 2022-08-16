package com.cursor.Task_a;

import com.cursor.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class List {
    public static final Logger LOGGER = LogManager.getLogger(List.class);

    private Input input = new Input();
    private Messages messages = new Messages();
    private boolean isContinue = true;
    private ArrayList<String> wordsList = new ArrayList<>();

    public void addElementsToList() {
        while (isContinue) {
            String word = input.inputWords();
            if (word.isBlank()) {
                messages.emptyStringMessage();
                continue;
            } else if (!word.equals("break")) {
                wordsList.add(word);
            } else {
                messages.inputBreakMessage();
                isContinue = false;
            }
        }
    }

    public void printAllWards() {
        for (String word : wordsList) {
            LOGGER.info(word);
        }
    }

    public void printAllWordsStartsFromS() {
        for (String word : wordsList) {
            if (word.startsWith("s")) {
               LOGGER.info(word);
            }
            continue;
        }
    }

    public void printAllWordsLettersMoreThan5() {
        for (String word : wordsList) {
            if (word.length() > 5) {
               LOGGER.info(word);
            }
            continue;
        }
    }
}