package eu.nullstack.kidlike.kyu7;

import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DisemvowelTrollsTest {
    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!",
                DisemvowelTrolls.disemvowel("This website is for losers LOL!"));
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd",
                DisemvowelTrolls.disemvowel
                        ("No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals("Wht r y,  cmmnst?", DisemvowelTrolls.disemvowel("What are you, a communist?"));
    }

    private static String generateRandomChars(String candidateChars, int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
        }
        return sb.toString();
    }

    private static String C(String Z) {
        return Z.replaceAll("(?i)[aeiou]", "");
    }

    @Test
    public void RandomTests() {
        for (int i = 0; i < 100; i++) {
            String X = generateRandomChars(
                    "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", i + 3);
            assertEquals(C(X), DisemvowelTrolls.disemvowel(X));
        }
    }
}