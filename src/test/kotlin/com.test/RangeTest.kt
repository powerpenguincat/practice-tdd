package com.test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RangeTest {
    @Test
    fun lowerAndUpper(): Unit {
        val range: Range = Range(3, 7)
        assertEquals(3, range.lower)
        assertEquals(7, range.upper)
    }

    @Test
    fun notation(): Unit {
        var range: Range = Range(3, 7)
        assertEquals("[3,7]", range.notation())
        range = Range(2, 8)
        assertEquals("[2,8]", range.notation())
    }
}