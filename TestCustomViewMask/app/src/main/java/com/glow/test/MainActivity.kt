package com.glow.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
/**
 * 题目1：
 *
 * 自定义一个镂空View达到高亮效果：Mask.kt
 * 镂空位置可点击，非镂空位置不可点击
 * 如：
 * 镂空位置在Button1上，等于button1获取高亮效果
 * 此时，button1可被点击（点击button1，上方hint变成 Clicked on Button 1)
 * button2此时非高亮，点击button2无效，上方hint变成 Clicked on Mask。
 * 注意！！注意！！注意！！button2此时无法获取点击事件。
 *
 * 请修改MainActivity来测试Mask
 * 一开始高亮button1
 * 点击button1，变成高亮button2
 * 点击button2，变成高亮button1
 *
 * 详情见视频
 * 注意！！注意！！注意！！请勿改变layout文件！！
 * 只需修改MainActivity和Mask俩个文件代码
 *
 * 建议用时：30分钟
 *
 */

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    mask.setOnClickListener {
      hint.text = "Clicked on mask"
    }
    button1.setOnClickListener {
      hint.text = "Clicked on Button 1"
    }
    button2.setOnClickListener {
      hint.text = "Clicked on Button 2"
    }
  }
}