package org.algorithmemes.stringandarrays;

import java.util.HashMap;
import java.util.Map;

public class ArraysAndStrings {

    public static boolean isAllUniqueChars(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            Integer count = map.get(c);

            if (count == null)
                map.put(c, 1);
            else
                return false;
        }

        return true;
    }
}
