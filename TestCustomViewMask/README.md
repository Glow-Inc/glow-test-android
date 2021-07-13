# 题目：
请自定义一个镂空View: [Mask.kt](app/src/main/java/com/glow/test/Mask.kt)，模拟高亮效果。


## 要求：
镂空部分后面的View可以收到触摸事件，而其他（灰色）部分不可以。

例如，要高亮Button1，则需使button1部分镂空。此时，button1可被点击。
同时，button2不在镂空部分，不可点击（无法收到触摸事件）。

请修改[MainActivity.kt](app/src/main/java/com/glow/test/MainActivity.kt)和[Mask.kt](app/src/main/java/com/glow/test/Mask.kt)，
- 初始状态：高亮button1，点击button2无效果，上方文字显示clicked on mask
- 点击button1，高亮button2，上方文字显示clicked on button1
- 点击button2，高亮button1，上方文字显示clicked on button2
- 以此类推，详情见[视频](20210713-150111_Glow Test_TargetResult.mp4)
 
 
 **注意！！注意！！注意！！请勿改变layout文件!！**
 **只需修改MainActivity.kt和Mask.kt俩个文件代码**
---
 建议用时：30分钟
