package com.wyk.viewtouchaction

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.LinearLayout

class MyViewContaner(context: Context, attrs: AttributeSet): LinearLayout(context, attrs) {

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        val takeTouch = "MyViewContaner==dispatchTouchEvent==${takeTouch(event)}"
        logi("${takeTouch}==")
        val dispatchTouchEvent = super.dispatchTouchEvent(event)
        logi("${takeTouch}==${dispatchTouchEvent}")
        return dispatchTouchEvent
    }

    override fun onInterceptTouchEvent(event: MotionEvent?): Boolean {
        var touchStr = ""
        var isIntercept = false
        when(event?.action){
            MotionEvent.ACTION_DOWN -> {
                touchStr = "按下"

            }
            MotionEvent.ACTION_MOVE -> {
                touchStr = "触摸"
                isIntercept = true //在move事件中拦截
            }
            MotionEvent.ACTION_UP -> {
                touchStr = "抬起"

            }
        }
        val takeTouch = "MyViewContaner==onInterceptTouchEvent==${touchStr}"
        logi("${takeTouch}==")
        //val onInterceptTouchEvent = super.onInterceptTouchEvent(event)
        //logi("${takeTouch}==${onInterceptTouchEvent}")
        //return onInterceptTouchEvent
        return isIntercept
    }

    /**
     * 在move中拦截，事件将不会传递到子View中
     */
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val takeTouch = "MyViewContaner==onTouchEvent==${takeTouch(event)}"
        logi("${takeTouch}==")
        val onTouchEvent = super.onTouchEvent(event)
        logi("${takeTouch}==${onTouchEvent}")
        return onTouchEvent
        //return true
    }


}