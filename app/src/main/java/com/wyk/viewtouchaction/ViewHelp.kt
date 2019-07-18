package com.wyk.viewtouchaction

import android.util.Log
import android.view.MotionEvent
import android.view.View

fun View.takeTouch(event: MotionEvent?): String{
    var touchStr = ""
    when(event?.action){
        MotionEvent.ACTION_DOWN -> {
            touchStr = "按下"
        }
        MotionEvent.ACTION_MOVE -> {
            touchStr = "触摸"
        }
        MotionEvent.ACTION_UP -> {
            touchStr = "抬起"
        }
    }
    return touchStr
}

fun View.logi(msg: String, tag: String = "wyk"){
    Log.i(tag, msg)
}