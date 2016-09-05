package com.feiyu.canvasstudy;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 李鸿达 on 2016/9/5.
 */
public class myCanvas extends View {

    private Paint mPaint = new Paint();

    public myCanvas(Context context) {
        this(context, null);
    }

    public myCanvas(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public myCanvas(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(5f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
/*
        //颜色
        canvas.drawColor(Color.BLUE);
        //点
        canvas.drawPoint(200, 200, mPaint);
        canvas.drawPoints(new float[]{
                300, 600,
                300, 700,
                300, 800
        }, mPaint);
        //线
        canvas.drawLine(300, 300, 400, 600, mPaint);
        canvas.drawLines(new float[]{
                100, 200, 200, 200,
                100, 300, 500, 600
        }, mPaint);
        //矩形
        canvas.drawRect(100,300,400,500,mPaint);

        Rect rect = new Rect(100,600,400,800);
        canvas.drawRect(rect,mPaint);

        mPaint.setColor(Color.YELLOW);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(10f);
        RectF rectF = new RectF(300,300,600,500);
        canvas.drawRect(rectF,mPaint);

        //圆角矩形
        RectF rectF1 = new RectF(100,700,800,800);
        canvas.drawRoundRect(rectF1,30,30,mPaint);

        //api21以上才可用
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(5f);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawRoundRect(100,500,400,700,30,30,mPaint);
        }

        //画圆
        canvas.drawCircle(500,500,50,mPaint);
*/

        //画圆弧
        RectF rectF3 = new RectF(100,100,400,400);
        // 绘制背景矩形
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(rectF3,mPaint);

        // 绘制圆弧
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(rectF3,0,100,false,mPaint);

        //-------------------------------------

        RectF rectF2 = new RectF(100,500,400,800);
        // 绘制背景矩形
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(rectF2,mPaint);

        // 绘制圆弧
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(rectF2,0,90,true,mPaint);
    }
}
