package eu.nullstack.kidlike.kyu7;

/**
 * https://www.codewars.com/kata/find-the-next-perfect-square/train/java
 */
class FindNextSquare {
    /**
     * You might know some pretty large perfect squares. But what about the NEXT one?
     * <p>
     * Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
     * <p>
     * If the parameter is itself not a perfect square, than -1 should be returned. You may assume the parameter is positive.
     */
    static long findNextSquare(long sq) {
        double sqrt = Math.sqrt(sq);
        if (sqrt % 1 != 0) {
            return -1;
        }

        return (long) Math.pow(sqrt + 1, 2);
    }
}