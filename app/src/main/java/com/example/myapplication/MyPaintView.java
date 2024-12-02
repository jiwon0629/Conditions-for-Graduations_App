package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class MyPaintView extends View {

    private Canvas mCanvas;
    private Bitmap mBitmap;
    private Paint mPaint;

    private float lastX, lastY;
    private Path mPath = new Path();
    private float mCurveEndX, mCurveEndY;
    private int mInvalidateExtraBorder = 10;

    static final float TOUCH_TOLERANCE = 8;

    public MyPaintView(Context context) {
        super(context);
        init();
    }

    public MyPaintView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void clear() {
        // 화면을 지우는 기능
        if (mBitmap != null) {
            mBitmap.eraseColor(Color.WHITE);  // 하얀색으로 화면을 지움
            invalidate();  // 화면을 갱신
        }
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setStrokeWidth(3.0F);

        lastX = -1;
        lastY = -1;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        mCanvas = new Canvas(mBitmap);
        mCanvas.drawColor(Color.WHITE);  // 초기 배경색
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (mBitmap != null) {
            canvas.drawBitmap(mBitmap, 0, 0, null);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                touchDown(event);
                return true;
            case MotionEvent.ACTION_MOVE:
                touchMove(event);
                return true;
            case MotionEvent.ACTION_UP:
                touchUp(event);
                return true;
        }
        return false;
    }

    private void touchDown(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        lastX = x;
        lastY = y;
        mPath.moveTo(x, y);
        mCanvas.drawPath(mPath, mPaint);
    }

    private void touchMove(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        float dx = Math.abs(x - lastX);
        float dy = Math.abs(y - lastY);

        if (dx >= TOUCH_TOLERANCE || dy >= TOUCH_TOLERANCE) {
            float cx = (x + lastX) / 2;
            float cy = (y + lastY) / 2;
            mPath.quadTo(lastX, lastY, cx, cy);
            lastX = x;
            lastY = y;
            mCanvas.drawPath(mPath, mPaint);
            invalidate();
        }
    }

    private void touchUp(MotionEvent event) {
        mPath.lineTo(lastX, lastY);
        mCanvas.drawPath(mPath, mPaint);
        mPath.reset();
    }

    public void setStrokeWidth(int width) {
        mPaint.setStrokeWidth(width);
    }

    public void setColor(int color) {
        mPaint.setColor(color);
    }
}
