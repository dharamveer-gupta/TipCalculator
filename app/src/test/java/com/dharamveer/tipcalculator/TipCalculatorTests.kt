package com.dharamveer.tipcalculator

import org.junit.Assert.*

import org.junit.Test
import java.text.NumberFormat

/**
 * @Author: Dharamveer Gupta
 * @Date: 23 May, 2024 15:22.
 * @Email: dharamveer.gupt@gmail.com
 * @Package: com.dharamveer.tipcalculator
 */
class TipCalculatorTests {

    @Test
    fun `calculateTip 20 Percent No Roundup`() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercentage = tipPercent, roundUp = false)
        assertEquals(expectedTip, actualTip)
    }
}