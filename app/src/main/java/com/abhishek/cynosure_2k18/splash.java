package com.abhishek.cynosure_2k18;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        final ImageView iv= (ImageView)findViewById(R.id.abhi);
        final Animation an= AnimationUtils.loadAnimation(getBaseContext(),R.anim.animation);
        final Animation an2= AnimationUtils.loadAnimation(getBaseContext(),R.anim.fade);
        iv.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

              finish();
              Intent toy= new Intent(splash.this,MainActivity.class);
              startActivity(toy);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
