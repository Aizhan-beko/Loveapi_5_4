package com.geeks.loveapi_5_4.MVP

class LoveCalculatorContract {

    interface View {
        fun showResult(result: LoveResultModel)
        fun showError(error: String)
    }

    interface Presenter {
        fun calculateLove(name1: String, name2: String)
    }
}
