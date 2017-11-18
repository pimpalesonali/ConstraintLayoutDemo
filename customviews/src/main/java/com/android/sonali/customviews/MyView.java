package com.android.sonali.customviews;

import android.content.Context;
import android.graphics.Canvas;

import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;

/**
 * Created by sonali on 16-11-2017.
 */

public class MyView extends android.support.v7.widget.AppCompatEditText {

    private Paint paint;
    private Canvas canvas;
    private float cx, cy;

    public MyView(Context context) {
        super(context);
        initPaint();
    }

    public MyView(Context context, android.util.AttributeSet attribs) {
        super(context, attribs);
        initPaint();
    }

    public void initPaint()
    {
        paint = new Paint() ;
        paint.setColor(Color.RED);
        paint.setStrokeWidth(1.5f);



    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.canvas = canvas;
        canvas.drawCircle(cx,cy,50,paint);

    }

   @Override
    public boolean onTouchEvent(MotionEvent event) {
        cx = event.getX();
        cy = event.getY();
        invalidate();
        return true;
    }
}
