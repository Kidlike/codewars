package eu.nullstack.kidlike.kyu7;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://www.codewars.com/kata/shortest-word/train/java
 */
class ShortestWord {
    /**
     * Simple, given a string of words, return the length of the shortest word(s).
     * <p>
     * String will never be empty and you do not need to account for different data types.
     */
    static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .min(Comparator.comparingInt(String::length))
                .get().length();
    }
}
