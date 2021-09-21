package com.hienqp.translate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewTranslate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animation animationTranslate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_translate);
        imageViewTranslate = (ImageView) findViewById(R.id.imageView_motorbike);
        imageViewTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animationTranslate);
            }
        });
    }
}