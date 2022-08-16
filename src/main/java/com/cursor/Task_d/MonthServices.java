package com.cursor.Task_d;

import com.cursor.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonthServices {
    public static final Logger LOGGER = LogManager.getLogger(MonthServices.class);
    Messages messages = new Messages();
    Month temp = Month.JANUARY;
    private List<Month> monthsList = new ArrayList<>(Arrays.asList(Month.values()));

    public boolean isMonthIsExist(String month) {
        int count = 0;
        for (Month tempMonth : monthsList) {
            if (month.equalsIgnoreCase(tempMonth.name())) {
                count++;
            }
        }
        if (count == 0) return false; return true;
    }

    public void monthsWithSameSeason(String month) {
        findEnteredMonthInList(month);
        for (Month tempMonth : monthsList) {
            if (temp.getSeason().equals(tempMonth.getSeason())) {
                LOGGER.info(tempMonth.name());
            }
        }
    }

    public void monthsWithTeSameCountOfDays(String month) {
        findEnteredMonthInList(month);
        for (Month tempMonth : monthsList) {
            if (temp.getNumberDays() == (tempMonth.getNumberDays())) {
                LOGGER.info(tempMonth.name());
            }
        }
    }

    public void monthsWithEvenCountOfDays() {
        for (Month tempMonth : monthsList) {
            if (tempMonth.getNumberDays() % 2 == 0) {
                LOGGER.info(tempMonth.name());
            }
        }
    }

    public void monthsWithOddCountOfDays() {
        for (Month tempMonth : monthsList) {
            if (tempMonth.getNumberDays() % 2 != 0) {
                LOGGER.info(tempMonth.name());
            }
        }
    }

    public boolean isEnteredMonthHasOddCountOfDays(String month) {
        if (!isMonthIsExist(month)) {
            messages.wrongParameterMessage();
            return false;
        } else
            for (Month tempMonth : monthsList) {
                if (month.equalsIgnoreCase(tempMonth.name())) {
                    temp = tempMonth;
                }
            }
        if (temp.getNumberDays() % 2 == 0) return true;
        return false;
    }

    private Month findEnteredMonthInList(String month) {
        for (Month tempMonth : monthsList) {
            if (month.equalsIgnoreCase(tempMonth.name())) {
                temp = tempMonth;
            }
        }
        return temp;
    }
}