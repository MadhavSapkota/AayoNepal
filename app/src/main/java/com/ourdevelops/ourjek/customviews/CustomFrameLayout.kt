package com.ourdevelops.ourjek.customviews

import android.content.Context
import android.util.AttributeSet
import android.view.GestureDetector
import android.view.GestureDetector.SimpleOnGestureListener
import android.view.MotionEvent
import android.widget.FrameLayout


class CustomFrameLayout(context: Context?, attrs: AttributeSet?) :
    FrameLayout(context!!, attrs) {
    private val gestureDetector: GestureDetector
    private var dragListener: IDragCallback? = null

    interface IDragCallback {
        fun onDrag()
    }

    fun setOnDragListener(listener: IDragCallback?) {
        dragListener = listener
    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        gestureDetector.onTouchEvent(ev)
        return false
    }

    private inner class GestureListener : SimpleOnGestureListener() {
        override fun onDown(e: MotionEvent): Boolean {
            return true
        }

        override fun onDoubleTap(e: MotionEvent): Boolean {
            return false
        }

        override fun onFling(
            e1: MotionEvent, e2: MotionEvent, velocityX: Float,
            velocityY: Float
        ): Boolean {
            return false
        }

        override fun onScroll(
            e1: MotionEvent, e2: MotionEvent,
            distanceX: Float, distanceY: Float
        ): Boolean {
            //that's when user starts dragging
            if (dragListener != null) {
                dragListener!!.onDrag()
            }
            return false
        }
    }

    init {
        gestureDetector = GestureDetector(context, GestureListener())
    }
}