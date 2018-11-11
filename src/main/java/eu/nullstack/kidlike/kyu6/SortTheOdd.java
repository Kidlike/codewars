package eu.nullstack.kidlike.kyu6;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/sort-the-odd/train/java
 */
class SortTheOdd {
    /**
     * You have an array of numbers.
     * <p>
     * Your task is to sort ascending odd numbers but even numbers must be on their places.
     * <p>
     * Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
     * <h3>Example:</h3>
     * <pre>
     * sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
     * </pre>
     */
    static int[] sortArray(int[] array) {
        int[] sortedOdds = Arrays.stream(array).filter(i -> i % 2 == 1).sorted().toArray();
        for (int i = 0, sI = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = sortedOdds[sI++];
            }
        }
        return array;
    }
}
