package com.test

data class Range(val lower: Int, val upper: Int) {
    fun notation(): String = "[$lower,$upper]"
}
