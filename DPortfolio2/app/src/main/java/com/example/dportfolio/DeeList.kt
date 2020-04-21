package com.example.dportfolio

import android.content.Context

class CharItem(val alpha: Context, val icons: Int?) {
    class CharItem {

        var icons: Int? = 0
        var alpha: String? = null
        var alpha2: String? = null

        constructor(icons: Int?, alpha: String?) {
            this.icons = icons
            this.alpha = alpha
            this.alpha2 = alpha2
        }
    }
}

