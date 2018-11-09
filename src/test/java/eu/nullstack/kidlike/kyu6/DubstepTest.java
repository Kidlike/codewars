package eu.nullstack.kidlike.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DubstepTest {
    @Test
    public void Test1() {
        assertEquals("ABC", new Dubstep().songDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void Test2() {
        assertEquals("R L", new Dubstep().songDecoder("RWUBWUBWUBLWUB"));
    }

    @Test
    public void Test3() {
        assertEquals("JKD WBIRAQKF YE WV", new Dubstep().songDecoder("WUBJKDWUBWUBWBIRAQKFWUBWUBYEWUBWUBWUBWVWUBWUB"));
    }

    @Test
    public void Test4() {
        assertEquals("KSDHEMIXUJ R S H", new Dubstep().songDecoder("WUBKSDHEMIXUJWUBWUBRWUBWUBWUBSWUBWUBWUBHWUBWUBWUB"));
    }

    @Test
    public void Test5() {
        assertEquals("Q QQ I WW JOPJPBRH", new Dubstep().songDecoder("QWUBQQWUBWUBWUBIWUBWUBWWWUBWUBWUBJOPJPBRH"));
    }

    @Test
    public void Test6() {
        assertEquals("O IPVCQAFWY Q XHDKCPYKCTWWY V FZ", new Dubstep().songDecoder("WUBWUBOWUBWUBWUBIPVCQAFWYWUBWUBWUBQWUBWUBWUBXHDKCPYKCTWWYWUBWUBWUBVWUBWUBWUBFZWUBWUB"));
    }

    @Test
    public void Test7() {
        assertEquals("YYRTSMNWU C C FSYUINDWOBV F AU V JB", new Dubstep().songDecoder("WUBYYRTSMNWUWUBWUBWUBCWUBWUBWUBCWUBWUBWUBFSYUINDWOBVWUBWUBWUBFWUBWUBWUBAUWUBWUBWUBVWUBWUBWUBJB"));
    }

    @Test
    public void Test8() {
        assertEquals("KSDHEMIXUJ R S H", new Dubstep().songDecoder("WUBKSDHEMIXUJWUBWUBRWUBWUBWUBSWUBWUBWUBHWUBWUBWUB"));
    }

    @Test
    public void Test9() {
        assertEquals("A", new Dubstep().songDecoder("AWUBWUBWUB"));
    }

    @Test
    public void Test10() {
        assertEquals("A B C D", new Dubstep().songDecoder("AWUBBWUBCWUBD"));
    }

    @Test
    public void Test11() {
        assertEquals("W U B", new Dubstep().songDecoder("WUBWWUBWUBWUBUWUBWUBBWUB"));
    }

    @Test
    public void Test12() {
        assertEquals("WU BW UB", new Dubstep().songDecoder("WUWUBBWWUBUB"));
    }

    @Test
    public void Test13() {
        assertEquals("WUAB", new Dubstep().songDecoder("WUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUABWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUBWUB"));
    }

    @Test
    public void Test14() {
        assertEquals("U", new Dubstep().songDecoder("U"));
    }

    @Test
    public void Test15() {
        assertEquals("WU", new Dubstep().songDecoder("WUWUB"));
    }

    @Test
    public void Test16() {
        assertEquals("UB", new Dubstep().songDecoder("UBWUB"));
    }

    @Test
    public void Test17() {
        assertEquals("WU UB U", new Dubstep().songDecoder("WUWUBUBWUBUWUB"));
    }

    @Test
    public void Test18() {
        assertEquals("W A", new Dubstep().songDecoder("WUBWWUBAWUB"));
    }

    @Test
    public void Test19() {
        assertEquals("WUUUUU", new Dubstep().songDecoder("WUUUUU"));
    }

    @Test
    public void Test20() {
        assertEquals("A", new Dubstep().songDecoder("WUBWUBA"));
    }
}