package com.glow.test

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class Mask @JvmOverloads constructor(
  context: Context,
  attributeSet: AttributeSet? = null,
  defStyle: Int = 0
) : View(context, attributeSet, defStyle) {


  private val maskColor = Color.argb(128, 0, 0, 0)


  override fun onDraw(canvas: Canvas) {
    canvas.drawColor(maskColor)
    // TODO 1 🌹 highlight specified area
  }


  override fun onTouchEvent(event: MotionEvent): Boolean {
    // TODO 2 🌹 view under highlighted area should be able to receive event
    return false
  }
}