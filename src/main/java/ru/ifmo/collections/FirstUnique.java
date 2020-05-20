package ru.ifmo.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Design a class which contains integers and returns first unique integer (in order of addition).
 * FirstUniqueTest can be used as an example.
 */
public class FirstUnique {
    LinkedHashMap<Integer, Boolean> map;

    public FirstUnique(int[] numbers) {
        this.map = new LinkedHashMap<Integer, Boolean>();
        for (int i : numbers) {
            this.add(i);
        }
    }

    public int showFirstUnique() {
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public void add(int value) {
        Boolean tmp = map.get(value);
        map.put(value, tmp != null ? false : true);
    }
}
