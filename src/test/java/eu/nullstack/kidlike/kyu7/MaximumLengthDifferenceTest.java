package eu.nullstack.kidlike.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumLengthDifferenceTest {
    @Test
    public void test() {
        System.out.println("mxdiflg Fixed Tests");
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        assertEquals(13, MaximumLengthDifference.mxdiflg(s1, s2)); // 13
    }

    @Test
    public void testEmpty() {
        assertEquals(-1, MaximumLengthDifference.mxdiflg(new String[]{}, new String[]{})); // 13
    }
}