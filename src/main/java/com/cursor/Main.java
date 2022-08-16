package com.cursor;

import com.cursor.Task_a.Main_Task_a;
import com.cursor.Task_b.Main_Task_b;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        // Task a:
        Main_Task_a mainA = new Main_Task_a();
        mainA.startTask();

        // Task b:
        Main_Task_b mainB = new Main_Task_b();
        mainB.startTaskB();

        // Tack c:



    }
}
