package com.example.myapp_test_11_homework2.ch11.recyclerDataTest

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
import com.example.myapp_test_11_homework.R

// 리사이클러 뷰에, 구분선 넣기, 이미지 목록 요소를 기준으로 , 전, 후 넣기.

class MyDecoration(val context: Context): RecyclerView.ItemDecoration() {

    //목록요소가 출력되기 전에 이미지를 먼저 출력함 .(배경으로 사용이됨)
    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDraw(c, parent, state)
        c.drawBitmap( // 안드로이드에서는 이미지 타입을 비트맵 또는 드로어블 타입으로 지정
            // 배경으로 사용할 이미지 하나
            //context -> 액티비티, 프래그먼트의 화면을 가리킬 때 많이 사용함
            BitmapFactory.decodeResource(context.getResources(), R.drawable.kuku),
            0f,
            0f,
            null
        );
    }

    //목록 요소가 출력 후에, 이미지를늦게출력함 (전경(foreground)으로 사용이 됨)
    override fun onDrawOver(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDrawOver(c, parent, state)
        //뷰 사이즈 계산
        val width = parent.width
        val height = parent.height
        //이미지 사이즈 계산
        val dr: Drawable? =
            // 포그라운드로 사용할 이미지 하나
            ResourcesCompat.getDrawable(context.getResources(), R.drawable.mokokocute, null)
        val drWidth = dr?.intrinsicWidth
        val drHeight = dr?.intrinsicHeight
        //이미지가 그려질 위치 계산 -> 정중앙을 계산식으로 표현함
        val left = width / 2 - drWidth?.div(2) as Int
        val top = height / 2 - drHeight?.div(2) as Int
        c.drawBitmap(
            BitmapFactory.decodeResource(context.getResources(), R.drawable.mokokolol),
            left.toFloat(),
            top.toFloat(),
            null
        )

    }

    //목록 요소들의 구분선을 넣을 때
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        val index = parent.getChildAdapterPosition(view) + 1

        //목록요소의 개수가 3개씩 지나갈 때 선을 긋는다.
        if (index % 3 == 0) //left, top, right, bottom
            outRect.set(10, 10, 10, 60)
        else
            outRect.set(10, 10, 10, 0)

        view.setBackgroundColor(Color.WHITE)
        ViewCompat.setElevation(view, 10.0f)

    }
}