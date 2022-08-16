package com.cursor.Task_c;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main_Task_c {
    public static final Logger LOGGER = LogManager.getLogger(Main_Task_c.class);

    public void startTaskC() {
        Person john = new Person("John", 25);
        Person alex = new Person("Alex", 48);
        Person bob = new Person("Bob", 19);

        john.accountsList.add(new Account("Facebook", "FacebookId"));
        john.accountsList.add(new Account("Twitter", "TwitterId"));
        alex.accountsList.add(new Account("Telegram", "TelegramId"));
        alex.accountsList.add(new Account("Facebook", "FacebookId"));
        bob.accountsList.add(new Account("Telegram", "TelegramId"));
        bob.accountsList.add(new Account("Google", "GoogleId"));

        Map<Person, ArrayList<Account>> personAccountsMap = new HashMap<>();
        personAccountsMap.put(john, john.accountsList);
        personAccountsMap.put(alex, alex.accountsList);
        personAccountsMap.put(bob, bob.accountsList);

        MapService mapService = new MapService();

        // Add the account to the list
        mapService.addAccountToTheList(personAccountsMap, alex, new Account("TikTok", "TikTokID"));
        LOGGER.info("\nAdded account 'tiktok' for alex: " + personAccountsMap);

        // Delete an account for a specific person
        mapService.deleteAccountPerson(personAccountsMap, alex, "facebook");
        LOGGER.info("\nDeleted facebook for alex from personAccountsMap: " + personAccountsMap);

        // Delete a person
        mapService.deletePerson(personAccountsMap, bob);
        LOGGER.info("\nDeleted Person 'bob' from personAccountsMap: " + personAccountsMap);

        //Show the entire map of people and their accounts.
        LOGGER.info("\nShow all Map with Persons and their Accounts: ");
        mapService.showAllMap(personAccountsMap);

        //Show the all account of alex
        LOGGER.info("\nAll  available accounts by person alex: ");
        mapService.showAllAccountsToPerson(personAccountsMap, alex);
    }
}