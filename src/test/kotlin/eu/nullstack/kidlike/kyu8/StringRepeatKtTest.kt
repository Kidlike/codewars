package eu.nullstack.kidlike.kyu8

import org.junit.Test

import org.junit.Assert.*

class StringRepeatKtTest {

    @Test
    fun repeatStrTest() {
        assertEquals(repeatStr(6, "I"), "IIIIII")
        assertEquals(repeatStr(5, "Hello"), "HelloHelloHelloHelloHello")
        assertEquals(repeatStr(5, ""), "")
        assertEquals(repeatStr(0, "kata"), "")
    }
}