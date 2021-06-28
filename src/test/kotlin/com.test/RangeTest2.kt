package com.test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

@DisplayName("閉区間を表現するdata class")
class RangeTest2 {
    @DisplayName("lowerメソッドは閉区間の下端点を返す")
    @ParameterizedTest(name = "下端点{0}、上端点{1}の整数区間の場合 lowerの戻り値は{2}")
    @CsvSource(
        "3, 7, 3",
        "2, 8, 2"
    )
    fun lower(lower: Int, upper: Int, expected: Int) {
        val range: Range = Range(lower, upper)
        assertEquals(expected, range.lower)
    }

    @DisplayName("upperメソッドは閉区間の上端点を返す")
    @ParameterizedTest(name = "下端点{0}、上端点{1}の整数区間の場合 upperの戻り値は{2}")
    @CsvSource(
        "3, 7, 7",
        "2, 8, 8"
    )
    fun upper(lower: Int, upper: Int, expected: Int) {
        val range: Range = Range(lower, upper)
        assertEquals(expected, range.upper)
    }

    @DisplayName("整数閉区間の文字列表記を返す")
    @ParameterizedTest(name = "下端点{0}、上端点{1}の整数区間の場合 notation()の戻り値は{2}")
    @CsvSource(
        "3, 7, '[3,7]'",
        "2, 8, '[2,8]'"
    )
    fun notation(lower: Int, upper: Int, expected: String) {
        val range: Range = Range(lower, upper)
        assertEquals(expected, range.notation())
    }

    @Nested
    @DisplayName("整数閉区間は指定した整数を含むかどうかを判定できる")
    inner class Includes {
        @DisplayName("下端点3、上端点7の整数区間の場合")
        @ParameterizedTest(name = "includes({0}) ==  {1}")
        @CsvSource(
            "3, true",
            "7, true",
            "5, true",
            "2, false",
            "8, false"
        )
        fun includes3to7(input: Int, expected: Boolean) {
            val range: Range = Range(3, 7)
            assertEquals(expected, range.includes(input))
        }

        @DisplayName("下端点2、上端点8の整数区間の場合")
        @ParameterizedTest(name = "includes({0}) ==  {1}")
        @CsvSource(
            "2, true",
            "8, true",
            "5, true",
            "1, false",
            "9, false"
        )
        fun includes2to8(input: Int, expected: Boolean) {
            val range: Range = Range(2, 8)
            assertEquals(expected, range.includes(input))
        }
    }
}