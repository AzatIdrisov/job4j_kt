package ru.job4j.base

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class KoTestCalc: FunSpec() {

    init {
        test("Add") {
            add(2, 2) shouldBe 4
        }

        test("Minus") {
            subtract(2, 2) shouldBe 0
        }

        test("Multiply") {
            multiply(5, 5) shouldBe 25
        }

        test("Divide") {
            divide(50.0, 5.0) shouldBe 10.0
        }
    }
}