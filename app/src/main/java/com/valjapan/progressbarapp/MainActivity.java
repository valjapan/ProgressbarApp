package com.valjapan.progressbarapp;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private  ProgressBar progressBar;
    private int percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        percent = 81;

        progressBar = (ProgressBar)findViewById(R.id.ProgressBarHorizontal);
        progressBar.setMax(100);
        progressBar.setProgress(percent);
        progressBar.setMin(0);
    }

    public void zero_percent(View v){
        percent = 0;
        onHogeProgressChanged(percent);
    }

    public void ten_percent(View v){
        percent = 10;
        onHogeProgressChanged(percent);
    }

    public void twenty_percent(View v){
        percent = 20;
        onHogeProgressChanged(percent);
    }

    public void thirty_percent(View v){
        percent = 30;
        onHogeProgressChanged(percent);
    }

    public void forty_percent(View v){
        percent = 40;
        onHogeProgressChanged(percent);
    }

    public void fifty_percent(View v){
        percent = 50;
        onHogeProgressChanged(percent);
    }

    public void sixty_percent(View v){
        percent = 60;
        onHogeProgressChanged(percent);
    }

    public void seventy_percent(View v){
        percent = 70;
        onHogeProgressChanged(percent);
    }

    public void eighty_percent(View v){
        percent = 80;
        onHogeProgressChanged(percent);
    }

    public void ninety_percent(View v){
        percent = 90;
        onHogeProgressChanged(percent);
    }

    public void one_hundred_percent(View v){
        percent = 100;
        onHogeProgressChanged(percent);
    }

    public void reset_percent(View v){
        percent = 81;
        onHogeProgressChanged(percent);
    }

    private void onHogeProgressChanged(int percentage){
      Animator animation = ObjectAnimator.ofInt(progressBar,"progress",percentage);
      animation.setDuration(500);
      animation.setInterpolator(new DecelerateInterpolator());
      animation.start();
    }
}
