package com.example.kaspresso

import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test

class IncrementButtonTest : TestCase(kaspressoBuilder = Kaspresso.Builder.simple()) {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun incrementButtonShouldIncreaseCounterValue() = run {
    step("Increase counter value to 2"){
        MainScreen {

        }
    }
    }

}