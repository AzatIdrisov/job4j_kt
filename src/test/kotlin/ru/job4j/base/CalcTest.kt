package ru.job4j.base

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


class CalcTest {

    @Test
    fun testAdd() {
        val result = add(2, 2)
        val expected = 4
        Assertions.assertThat(result)
            .isEqualTo(expected)
    }

    @Test
    fun testMinus() {
        val result = subtract(2, 2)
        val expected = 0
        Assertions.assertThat(result)
            .isEqualTo(expected)
    }

    @Test
    fun testMultiply() {
        val result = multiply(5, 5)
        val expected = 25
        Assertions.assertThat(result)
            .isEqualTo(expected)
    }

    @Test
    fun testDivide() {
        val result = divide(50.0, 10.0)
        val expected = 5.0
        Assertions.assertThat(result)
            .isEqualTo(expected)
    }
}