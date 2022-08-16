package com.cursor.Task_a;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Messages {
    public static final Logger LOGGER = LogManager.getLogger(Messages.class);

    public void inputWordsMessage() {
        LOGGER.info("Please, input word: ");
    }

    public void inputChoiceMessage() {
        LOGGER.info(
                "\nWhat do you want to do?" +
                "\nType '1' for output all the words that you entered" +
                "\nType '2' for output words that start with “s”!" +
                "\nType '3' for output words that have a number of letters more than 5!" +
                "\nType '0' for exit from program" +
                "\nMake your choice: ");
    }

    public void emptyStringMessage() {
        LOGGER.info("You enter empty string, try again");
    }

    public void inputBreakMessage() {
        LOGGER.info("You input word 'Break' and i finish add words to list");
    }

    public void inputWrongParameterMessage() {
        LOGGER.info("You input wrong parameter, try again");
    }
}