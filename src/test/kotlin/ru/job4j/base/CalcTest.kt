package ru.job4j.base

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue


class CalcTest {

    @Test
    fun testAdd() {
        val result = add(2, 2)
        val expected = 4
        assertTrue { result == expected }
    }

    @Test
    fun testMinus() {
        val result = subtract(2, 2)
        val expected = 0
        assertTrue { result == expected }
    }

    @Test
    fun testMultiply() {
        val result = multiply(5, 5)
        val expected = 25
        assertTrue { result == expected }
    }

    @Test
    fun testDivide() {
        val result = divide(50.0, 10.0)
        val expected = 5.0
        assertTrue { result == expected }
    }
}