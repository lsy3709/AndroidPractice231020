package com.example.myapp_test_7_8_9_10_11_12.ch11_Test.recyclerDataTest

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.view.View
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp_test_7_8_9_10_11_12.R

// 리사이클러 뷰에, 구분선 넣기, 이미지 목록 요소를 기준으로 , 전, 후 넣기.

class MyDecoration(val context: Context): RecyclerView.ItemDecoration() {
    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDraw(c, parent, state)
        c.drawBitmap(
            // 배경으로 사용할 이미지 하나
            BitmapFactory.decodeResource(context.getResources(), R.drawable.shop),
            0f,
            0f,
            null
        );
    }

    override fun onDrawOver(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDrawOver(c, parent, state)
        //뷰 사이즈 계산
        val width = parent.width
        val height = parent.height
        //이미지 사이즈 계산
        val dr: Drawable? =
            // 포그라운드로 사용할 이미지 하나
            ResourcesCompat.getDrawable(context.getResources(), R.drawable.bread, null)
        val drWidth = dr?.intrinsicWidth
        val drHeight = dr?.intrinsicHeight
        //이미지가 그려질 위치 계산
        val left = width / 2 - drWidth?.div(2) as Int
        val top = height / 2 - drHeight?.div(2) as Int
        c.drawBitmap(
            BitmapFactory.decodeResource(context.getResources(), R.drawable.bread),
            left.toFloat(),
            top.toFloat(),
            null
        )

    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        val index = parent.getChildAdapterPosition(view) + 1

        if (index % 3 == 0) //left, top, right, bottom
            outRect.set(10, 10, 10, 60)
        else
            outRect.set(10, 10, 10, 0)

        view.setBackgroundColor(Color.LTGRAY)
        ViewCompat.setElevation(view, 20.0f)

    }
}