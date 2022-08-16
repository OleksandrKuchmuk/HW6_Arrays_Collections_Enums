package com.cursor.Task_d;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Messages {
    public static final Logger LOGGER = LogManager.getLogger(Messages.class);

    public void firstMessage() {
        LOGGER.info("\nto check if such a month exists, enter 1" +
                "\nto display all months with the same season enter 2" +
                "\nto display all months that have the same number of days, enter 3" +
                "\nto display all months with an even number of days on the screen, enter 4" +
                "\nto display all months with an odd number of days on the screen, enter 5" +
                "\nto display whether the month entered from the console has an even number days, enter 6" +
                "\nto exit the program enter 0" +
                "\nEnter your choice: ");
    }

    public void enterMonthMessage() {
        LOGGER.info("\nPlease. enter name of the month: ");
    }

    public void wrongParameterMessage() {
        LOGGER.info("\nWarning!!! You entered wrong parameter: ");
    }

    public void continueMessage() {
        LOGGER.info("\nDo you want to continue? " +
                "\nenter 'y' for yes, or 'n' for no");
    }
}