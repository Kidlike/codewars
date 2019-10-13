package eu.nullstack.kidlike.kyu6

import org.junit.Test
import kotlin.test.assertEquals

class PlayingWithDigitsKtTest {

    @Test
    fun digPowTest() {
        assertEquals(digPow(89, 1), 1)
        assertEquals(digPow(92, 1), -1)
        assertEquals(digPow(695, 2), 2)
        assertEquals(digPow(46288, 3), 51)
    }
}