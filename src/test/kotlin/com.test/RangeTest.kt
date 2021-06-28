package com.test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@DisplayName("閉区間を表現するdata class")
class RangeTest {
    private lateinit var range: Range

    @Nested
    @DisplayName("整数閉区間が３から７の場合")
    inner class Lower3upper7 {
        @BeforeEach
        fun setUp(): Unit {
            range = Range(3, 7)
        }

        @Test
        @DisplayName("下端点は３")
        fun lower(): Unit {
            assertEquals(3, range.lower)
        }

        @Test
        @DisplayName("上端点は７")
        fun upper(): Unit {
            assertEquals(7, range.upper)
        }

        @Test
        @DisplayName("文字列表記は[3,7]")
        fun notation(): Unit {
            assertEquals("[3,7]", range.notation())
        }

        @Test
        @DisplayName("５を含む")
        fun includes5(): Unit {
            assertTrue(range.includes(5))
        }

        @Test
        @DisplayName("２を含まない")
        fun notIncludes2(): Unit {
            assertFalse(range.includes(2))
        }

        @Test
        @DisplayName("９を含まない")
        fun notIncludes9(): Unit {
            assertFalse(range.includes(9))
        }

        @Test
        @DisplayName("下端点を含む")
        fun includes3(): Unit {
            assertTrue(range.includes(3))
        }

        @Test
        @DisplayName("上端点を含む")
        fun includes7(): Unit {
            assertTrue(range.includes(7))
        }
    }
}