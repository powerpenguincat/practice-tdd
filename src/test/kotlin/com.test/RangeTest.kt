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
}