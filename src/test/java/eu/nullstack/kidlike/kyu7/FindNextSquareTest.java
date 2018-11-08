package eu.nullstack.kidlike.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindNextSquareTest {
    @Test
    public void test1() {
        assertEquals(144, FindNextSquare.findNextSquare(121));
    }

    @Test
    public void test2() {
        assertEquals(676, FindNextSquare.findNextSquare(625));
    }

    @Test
    public void test3() {
        assertEquals(-1, FindNextSquare.findNextSquare(114));
    }


    @Test
    public void test4() {
        assertEquals(15241630849L, FindNextSquare.findNextSquare(15241383936L));
    }

    @Test
    public void test5() {
        assertEquals(-1, FindNextSquare.findNextSquare(342786627));
    }

    @Test
    public void randomTest1() {
        long input = (long) (Math.random() * 100000L) + 1;
        long square = input * input;

        assertEquals(square + (input * 2 + 1), FindNextSquare.findNextSquare(square));
    }
}