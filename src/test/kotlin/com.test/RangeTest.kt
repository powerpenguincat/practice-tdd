package com.test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class RangeTest {
    private lateinit var range: Range

    @Nested
    inner class lower3upper7 {
        @BeforeEach
        fun setUp(): Unit {
            range = Range(3, 7)
        }

        @Test
        @DisplayName("整数閉区間は下端点と上端点を持つ")
        fun lowerAndUpper(): Unit {
            assertEquals(3, range.lower)
            assertEquals(7, range.upper)
        }

        @Test
        @DisplayName("整数閉区間の文字列表記を返せる")
        fun notation(): Unit {
            assertEquals("[3,7]", range.notation())
            range = Range(2, 8)
            assertEquals("[2,8]", range.notation())
        }

        @Test
        @DisplayName("整数閉区間は指定した整数を含むかどうかを判定できる")
        fun includes(): Unit {
            assertTrue(range.includes(5))
            assertFalse(range.includes(2))
            assertFalse(range.includes(9))
        }

        @Test
        @DisplayName("整数閉区間は下端点を含む")
        fun includes3(): Unit {
            assertTrue(range.includes(3))
        }

        @Test
        @DisplayName("整数閉区間は上端点を含む")
        fun includes7(): Unit {
            assertTrue(range.includes(7))
        }
    }
}