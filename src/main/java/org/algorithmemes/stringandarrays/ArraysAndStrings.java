package org.algorithmemes.stringandarrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysAndStrings {

    public static boolean isPermutation(String a, String b) {

        if (a.length() != b.length())
            return false;
        int[] allChars = new int[128];

        for (int i = 0; i < a.length(); i++)
            allChars[a.charAt(i)]++;
        for (int i = 0; i < a.length(); i++) {
            allChars[b.charAt(i)]--;
            if (allChars[b.charAt(i)] < 0)
                return false;
        }
        return true;
    }

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
