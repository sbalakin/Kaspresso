package com.kaspersky.kaspressample.screen

import com.agoda.kakao.scroll.KScrollView
import com.agoda.kakao.text.KButton
import com.kaspersky.kaspressample.R
import com.kaspersky.kaspressample.flaky.CommonFlakyActivity

object ScrollViewSampleScreen : KScreen<ScrollViewSampleScreen>() {

    override val layoutId: Int? = R.layout.activity_scroll_view_sample
    override val viewClass: Class<*>? = CommonFlakyActivity::class.java

    val scrollView = KScrollView {
        withId(R.id.scroll_view)
    }

    val btn1 = KButton {
        withId(R.id.scroll_view_btn1)
    }

    val btn3 = KButton {
        withId(R.id.scroll_view_btn3)
    }

    val btn5 = KButton {
        withId(R.id.scroll_view_btn5)
    }

    val tv6 = KButton {
        withId(R.id.scroll_view_tv6)
    }
}