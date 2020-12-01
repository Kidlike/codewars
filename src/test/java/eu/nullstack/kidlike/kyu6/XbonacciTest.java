package eu.nullstack.kidlike.kyu6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XbonacciTest {
    private Xbonacci variabonacci;

    @Before
    public void setUp() {
        variabonacci = new Xbonacci();
    }

    @Test
    public void basicTests() {
        assertArrayEquals(new double[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, variabonacci.xbonacci(new double[]{0, 1}, 10));
        assertArrayEquals(new double[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55}, variabonacci.xbonacci(new double[]{1, 1}, 10));
        assertArrayEquals(new double[]{0, 0, 0, 0, 1, 1, 2, 4, 8, 16}, variabonacci.xbonacci(new double[]{0, 0, 0, 0, 1}, 10));
        assertArrayEquals(new double[]{1, 0, 0, 0, 0, 0, 1, 2, 3, 6}, variabonacci.xbonacci(new double[]{1, 0, 0, 0, 0, 0, 1}, 10));
    }

    private void assertArrayEquals(double[] expectedS, double[] actualS) {
        for (int i = 0; i < actualS.length; i++)
            assertEquals(expectedS[i], actualS[i], 1e-10);
    }
}