package com.cursor.Task_b;

import com.cursor.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Main_Task_b {
    public static final Logger LOGGER = LogManager.getLogger(Main_Task_b.class);

    public void startTaskB () {
        Cat cat = new Cat(1, "Tom", "Angora");
        Cat cat1 = new Cat(3, "Missy", "Bengal");
        Cat cat2 = new Cat(4, "Lily", "Persian");
        Cat cat3 = new Cat(2, "Jerry", "Siamese");
        Cat cat4 = new Cat(1, "Mike", "Siberian");
        Cat cat5 = new Cat(3, "Kitty", "Balinese");

        // HashSet
        Set<Cat> catHashSet = new HashSet<>();
        catHashSet.add(cat);
        catHashSet.add(cat1);
        catHashSet.add(cat2);
        catHashSet.add(cat3);
        catHashSet.add(cat4);
        catHashSet.add(cat5);
        //Display the unsorted list first, then sorted to console
        LOGGER.info("\nOriginal HashSet: " + catHashSet);
        List<Cat> catsHashList = new ArrayList<>(catHashSet);
        Collections.sort(catsHashList);
        LOGGER.info("Sorted HashSet: " + catsHashList);

        //TreeSet
        Set<Cat> catTreeSet = new TreeSet<>();
        catTreeSet.add(cat);
        catTreeSet.add(cat1);
        catTreeSet.add(cat2);
        catTreeSet.add(cat3);
        catTreeSet.add(cat4);
        catTreeSet.add(cat5);
        //Display the unsorted list first, then sorted to console
        LOGGER.info("\nOriginal TreeSet: " + catTreeSet);
        List<Cat> catsTreeList = new ArrayList<>(catTreeSet);
        Collections.sort(catsTreeList);
        LOGGER.info("Sorted TreeSet: " + catsTreeList);

        //LinkedHashSet
        Set<Cat> catLinkedHashSet = new LinkedHashSet<>();
        catLinkedHashSet.add(cat5);
        catLinkedHashSet.add(cat3);
        catLinkedHashSet.add(cat2);
        catLinkedHashSet.add(cat4);
        catLinkedHashSet.add(cat);
        catLinkedHashSet.add(cat1);
        //Display the unsorted list first, then sorted to console
        LOGGER.info("\nOriginal LinkedHashSet: " + catLinkedHashSet);
        List<Cat> catsLinkedHashList = new ArrayList<>(catLinkedHashSet);
        Collections.sort(catsLinkedHashList);
        catLinkedHashSet.clear();
        catLinkedHashSet.addAll(catsLinkedHashList);
        LOGGER.info("Sorted LinkedHashSet: " + catLinkedHashSet);
    }
}