package com.westhillcs.countdowntimer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Chandan on 7/26/2016.
 */
public class MashView extends View {

    private static Random random;
    private CountDownTimer countDownTimer;
    // c needs to be declared final to have access inside timer inner class
    private final Context c;
    private Bitmap sprite;

    public MashView(Context context) {
        super(context);
        random = new Random();
        c = context;
        sprite = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);

        countDownTimer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                //tv_timeLeft.setText(millisUntilFinished/1000 + " sec");
                Log.v("Inside onTick()", "");

                invalidate();
            }

            @Override
            public void onFinish() {
                onTick(0);
               // tv_message.setText("Game Over");

                Toast.makeText(c, "GAME OVER", Toast.LENGTH_SHORT).show();
            }
        };
        countDownTimer.start();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.v("Inside onDRaw()", "");
        //Toast.makeText(MashView.this.c, "OnDRaw()" , Toast.LENGTH_SHORT).show();

        int x= random.nextInt(canvas.getWidth()-sprite.getWidth());
        int y= random.nextInt(canvas.getHeight()-sprite.getHeight());
        canvas.drawBitmap(sprite, x, y, null) ;


    }
}
