package com.wyk.viewtouchaction

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.Button

class MyButton(context: Context, attrs: AttributeSet): Button(context, attrs) {

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {

        //禁止拦截
        getParent().requestDisallowInterceptTouchEvent(true)
        val takeTouch = "MyButton==dispatchTouchEvent==${takeTouch(event)}"
        logi("${takeTouch}==")
        val dispatchTouchEvent = super.dispatchTouchEvent(event)
        logi("${takeTouch}==${dispatchTouchEvent}")
        return dispatchTouchEvent
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val takeTouch = "MyButton==onTouchEvent==${takeTouch(event)}"
        logi("${takeTouch}==")
        val onTouchEvent = super.onTouchEvent(event)
        logi("${takeTouch}==${onTouchEvent}")
        return onTouchEvent
        //return false
        //return true
    }

}