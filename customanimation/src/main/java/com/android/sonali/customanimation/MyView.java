package com.android.sonali.customanimation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.TextView;

/**
 * Created by sonali on 17-11-2017.
 */

public class MyView extends android.support.v7.widget.AppCompatTextView {
    private Paint paint;
    private Canvas canvas;

    public MyView(Context context) {
        super(context);
    }

    public void initPaint()
    {
        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(1.5f);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(1.5f,2.5f,1.5f,2.5f,paint);
    }
}
