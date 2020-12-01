package eu.nullstack.kidlike.kyu6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TribonacciTest {
    private Tribonacci variabonacci;

    @Before
    public void setUp() {
        variabonacci = new Tribonacci();
    }

    private final double precision = 1e-10;

    @Test
    public void sampleTests() {
        assertArrayEquals(new double[]{1, 1, 1, 3, 5, 9, 17, 31, 57, 105}, variabonacci.tribonacci(new double[]{1, 1, 1}, 10), precision);
        assertArrayEquals(new double[]{0, 0, 1, 1, 2, 4, 7, 13, 24, 44}, variabonacci.tribonacci(new double[]{0, 0, 1}, 10), precision);
        assertArrayEquals(new double[]{0, 1, 1, 2, 4, 7, 13, 24, 44, 81}, variabonacci.tribonacci(new double[]{0, 1, 1}, 10), precision);
    }

    @Test
    public void n_is_less_than_3() {
        assertArrayEquals(new double[]{}, variabonacci.tribonacci(new double[]{}, 0), precision);
        assertArrayEquals(new double[]{5}, variabonacci.tribonacci(new double[]{5}, 1), precision);
        assertArrayEquals(new double[]{6, 7}, variabonacci.tribonacci(new double[]{6, 7}, 2), precision);
    }
}