package com.cursor;

import com.cursor.Task_a.Main_Task_a;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        // Task a:
        Main_Task_a mainA = new Main_Task_a();
        mainA.startTask();

        // Task b:


    }
}
