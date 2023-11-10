package ru.job4j.base

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class MaxTest {

    @Test
    fun testMaxWithTwoNumbers() {
        val result = max(1, 2)
        val expected = 2
        assertTrue { result == expected }
    }

    @Test
    fun testMaxWithThreeNumbers() {
        val result = max(1, 2, 3)
        val expected = 3
        assertTrue { result == expected }
    }
}