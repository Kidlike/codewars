package eu.nullstack.kidlike.kyu7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * https://www.codewars.com/kata/maximum-length-difference/train/java
 */
class MaximumLengthDifference {
    /**
     * You are given two arrays a1 and a2 of strings.
     * Each string is composed with letters from a to z.
     * Let x be any string in the first array and y be any string in the second array.
     * <p>
     * Find max(abs(length(x) − length(y)))
     * <p>
     * If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).
     *
     * <h3>Example:</h3>
     *
     * <pre>
     * a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
     * a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
     * mxdiflg(a1, a2) --> 13
     * </pre>
     */
    static int mxdiflg(String[] a1, String[] a2) {
        List<String> a1List = Arrays.asList(a1);
        List<String> a2List = Arrays.asList(a2);

        if (a1List.isEmpty() || a2List.isEmpty()) {
            return -1;
        }

        int a1Max = Collections.max(a1List, Comparator.comparingInt(String::length)).length();
        int a1Min = Collections.min(a1List, Comparator.comparingInt(String::length)).length();
        int a2Max = Collections.max(a2List, Comparator.comparingInt(String::length)).length();
        int a2Min = Collections.min(a2List, Comparator.comparingInt(String::length)).length();

        return Math.max(Math.abs(a1Max - a2Min), Math.abs(a1Min - a2Max));
    }
}
