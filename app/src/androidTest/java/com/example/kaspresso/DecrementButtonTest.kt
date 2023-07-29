package com.example.kaspresso

import android.Manifest
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.rule.GrantPermissionRule
import com.example.kaspresso.MainScreen.counterText
import com.kaspersky.components.alluresupport.withForcedAllureSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test

class DecrementButtonTest :
    TestCase(kaspressoBuilder = Kaspresso.Builder.withForcedAllureSupport()) {

    @get:Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @get:Rule
    val runtimePermission: GrantPermissionRule = GrantPermissionRule.grant(
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE,
    )

    @Test
    fun decrementButtonShouldDecreaseCounterValue() = run {
        step("Decrease counter value to -2") {
            MainScreen {
                repeat(2) {
                    decrementButton.click()
                }
            }
        }
        step("Assert that counter value equals -2") {
            counterText.hasText("Count: -2")
        }
    }

}