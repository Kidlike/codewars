package eu.nullstack.kidlike.kyu7;

/**
 * https://www.codewars.com/kata/isograms/train/java
 */
class Isogram {

    /**
     * An isogram is a word that has no repeating letters, consecutive or non-consecutive.
     * <p>
     * Implement a function that determines whether a string that contains only letters is an isogram.
     * <p>
     * Assume the empty string is an isogram. Ignore letter case.
     * <p>
     * Examples:
     * <pre>
     * isIsogram "Dermatoglyphics" == true
     * isIsogram "moose" == false
     * isIsogram "aba" == false
     * </pre>
     */
    static boolean isIsogram(String str) {
        return str.toLowerCase()
                .chars()
                .distinct()
                .count() == str.length();
    }
}
