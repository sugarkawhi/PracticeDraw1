package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint paint = new Paint();
    private static final int Radius = 250;
    private RectF rectF = new RectF();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        int x = getWidth() / 2;
        int y = getHeight() / 2;

        int offset = 10;
        canvas.drawArc(x - offset - Radius, y - offset - Radius, x - offset + Radius, y - offset + Radius, -180, 120, true, paint);

        rectF.set(x - Radius, y - Radius, x + Radius, y + Radius);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectF, 0, -58, true, paint);
        paint.setColor(Color.parseColor("#FF00AA"));
        canvas.drawArc(rectF, 3, 15, true, paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(rectF, 21, 15, true, paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(rectF, 39, 40, true, paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(rectF, 82, 95, true, paint);

        paint.setTextSize(42);
        paint.setColor(Color.WHITE);
        canvas.drawText("饼图", getWidth() / 2 - 50, getHeight() / 2 + 320, paint);
    }
}
