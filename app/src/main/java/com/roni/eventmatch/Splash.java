package com.roni.eventmatch;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Splash extends AppCompatActivity {

        private ImageView myImageview5;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_splash);

            myImageview5 = findViewById(R.id.imageView5);





            Thread mSplashThread = new Thread() {

                @Override

                public void run() {

                    try {

                        synchronized (this) {
                            Animation myFadaInAnimation = AnimationUtils.loadAnimation(Splash.this,R.anim.tween);
                            myImageview5.startAnimation(myFadaInAnimation);

                            wait(4000);

                        }

                    } catch (InterruptedException ex) {

                    }

                    finish();

                    Intent intent = new Intent(Splash.this, MainActivity.class);

                    startActivity(intent);

                }

            };

            mSplashThread.start();




    }

}
