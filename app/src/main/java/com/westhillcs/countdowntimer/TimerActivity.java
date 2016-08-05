package com.westhillcs.countdowntimer;

import android.graphics.Canvas;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;

public class TimerActivity extends AppCompatActivity {

    private MashView mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mv = new MashView(this);
        Log.v("OnCreate()", "");
        setContentView(mv);

    }

}



