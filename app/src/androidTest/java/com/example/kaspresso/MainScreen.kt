package com.example.kaspresso

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KButton

object MainScreen : KScreen<MainScreen>(){

    override val layoutId: Int = R.layout.activity_main
    override val viewClass: Class<*> = MainActivity::class.java

    val incrementButton = KButton {withId(R.id.increment)}
    val decrementButton = KButton {withId(R.id.decrement)}
    val resetButton = KButton {withId(R.id.reset)}
}