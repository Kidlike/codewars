package eu.nullstack.kidlike.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VasyaClerkTest {
    @Test
    public void test1() {
        assertEquals("YES", VasyaClerk.Tickets(new int[]{25, 25, 50}));
    }

    @Test
    public void test2() {
        assertEquals("NO", VasyaClerk.Tickets(new int[]{25, 100}));
    }

    @Test
    public void test3() {
        assertEquals("YES", VasyaClerk.Tickets(new int[]{25, 25, 25, 25, 25, 25, 25, 25, 25, 25}));
    }

    @Test
    public void test4() {
        assertEquals("NO", VasyaClerk.Tickets(new int[]{50, 50, 50, 50, 50, 50, 50, 50, 50, 50}));
    }

    @Test
    public void test5() {
        assertEquals("NO", VasyaClerk.Tickets(new int[]{100, 100, 100, 100, 100, 100, 100, 100, 100, 100}));
    }

    @Test
    public void test6() {
        assertEquals("YES", VasyaClerk.Tickets(new int[]{25, 25, 25, 25, 50, 100, 50}));
    }

    @Test
    public void test7() {
        assertEquals("NO", VasyaClerk.Tickets(new int[]{50, 100, 100}));
    }

    @Test
    public void test8() {
        assertEquals("NO", VasyaClerk.Tickets(new int[]{25, 25, 100}));
    }

    @Test
    public void test9() {
        assertEquals("NO", VasyaClerk.Tickets(new int[]{25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 100, 100, 100, 100}));
    }

    @Test
    public void test10() {
        assertEquals("NO", VasyaClerk.Tickets(new int[]{25, 25, 50, 50, 100}));
    }

    @Test
    public void test11() {
        assertEquals("NO", VasyaClerk.Tickets(new int[]{25, 25, 25, 25, 25, 100, 100}));
    }
}