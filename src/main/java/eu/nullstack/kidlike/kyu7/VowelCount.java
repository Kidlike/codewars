package eu.nullstack.kidlike.kyu7;

/**
 * https://www.codewars.com/kata/vowel-count/train/java
 */
class VowelCount {
    /**
     * Return the number (count) of vowels in the given string.
     * <p>
     * We will consider a, e, i, o, and u as vowels for this Kata.
     * <p>
     * The input string will only consist of lower case letters and/or spaces.
     */
    static int getCount(String str) {
        return str.replaceAll("[^aeiou]", "").length();
    }
}
