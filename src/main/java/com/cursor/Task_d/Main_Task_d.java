package com.cursor.Task_d;

import com.cursor.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main_Task_d {
    public static final Logger LOGGER = LogManager.getLogger(Main_Task_d.class);
    MonthServices monthServices = new MonthServices();
    InputService inputService = new InputService();
    Messages messages = new Messages();
    private boolean isContinues = true;

    public void seasonsMonthsDays() {
        while(isContinues) {
            switch (inputService.makeYourChoice()) {
                case 0:
                    System.exit(999);
                    break;
                case 1:
                    LOGGER.info(monthServices.isMonthIsExist(inputService.enterMonth()));
                    break;
                case 2:
                    monthServices.monthsWithSameSeason(inputService.enterMonth());
                    break;
                case 3:
                    monthServices.monthsWithTeSameCountOfDays(inputService.enterMonth());
                    break;
                case 4:
                    monthServices.monthsWithEvenCountOfDays();
                    break;
                case 5:
                    monthServices.monthsWithOddCountOfDays();
                    break;
                case 6:
                    LOGGER.info(monthServices.isEnteredMonthHasOddCountOfDays(inputService.enterMonth()));
                    break;
                default:
                    messages.wrongParameterMessage();
                    isContinue();
                    break;
            }
        }
    }

    public void isContinue(){
        messages.continueMessage();
       switch (inputService.enterForContinue()){
           case "y":
               isContinues = true;
               seasonsMonthsDays();
               break;
           case "n":
               isContinues = false;
               seasonsMonthsDays();
               break;
           default:
               messages.wrongParameterMessage();
               isContinue();
        }
    }
}