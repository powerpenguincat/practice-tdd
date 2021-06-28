package com.test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RangeTest {
    @Test
    fun lowerAndUpper(): Unit {
        val range: Range = Range(3)
        assertEquals(3, range.lower)
    }
}