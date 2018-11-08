package eu.nullstack.kidlike.kyu7;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/mumbling/train/java
 */
class Mumbling {
    /**
     * This time no story, no theory. The examples below show you how to write function accum:
     * <p>
     * Examples:
     * <pre>
     * Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
     * Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
     * Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
     * </pre>
     * The parameter of accum is a string which includes only letters from a..z and A..Z.
     */
    static String accum(String s) {
        StringBuilder ret = new StringBuilder(s.length());
        char[] chars = s.toCharArray();

        ret.append(Character.toUpperCase(chars[0]));

        for (int i = 1; i < chars.length; i++) {
            ret.append('-');

            char c = chars[i];
            ret.append(Character.toUpperCase(c));

            char[] array = new char[i];
            Arrays.fill(array, Character.toLowerCase(c));

            ret.append(array);
        }

        return ret.toString();
    }
}
