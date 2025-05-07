package com.dharamveer.tipcalculator

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.dharamveer.tipcalculator.ui.theme.TipCalculatorTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat


/**
 * @Author: Dharamveer Gupta
 * @Date: 07 May, 2025 15:15.
 * @Email: dharamveer.gupt@gmail.com
 * @Package: com.dharamveer.tipcalculator
 */
class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun create_20_percent_tip() {
        composeTestRule.setContent {
            TipCalculatorTheme {
                TipTimeLayout()
            }
        }
        composeTestRule.onNodeWithText("Bill Amount").performTextInput("10")
        composeTestRule.onNodeWithText("Tip Percentage").performTextInput("20")
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        composeTestRule.onNodeWithText("Tip Amount: $expectedTip").assertExists("No node with this text was found.")

    }


}