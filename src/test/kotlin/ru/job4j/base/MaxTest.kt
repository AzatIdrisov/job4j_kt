package ru.job4j.base

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MaxTest {

    @Test
    fun testMaxWithTwoNumbers() {
        val result = max(1, 2)
        val expected = 2
        assertThat(result)
            .isEqualTo(expected)
    }

    @Test
    fun testMaxWithThreeNumbers() {
        val result = max(1, 2, 3)
        val expected = 3
        assertThat(result)
            .isEqualTo(expected)
    }
}