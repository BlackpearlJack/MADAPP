package com.example.quizword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class BossAct2 extends AppCompatActivity {
    TextView textScreen,textQuestion,textTitle, textBtn;
    ImageView bigboss;
    Animation smalltobig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss_act2);

        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/FredokaOne-Regular.ttf");

        textQuestion = (TextView) findViewById(R.id.textQuestion);
        textScreen = (TextView) findViewById(R.id.textScreen);
        textTitle = (TextView) findViewById(R.id.textTitle);
        textBtn = (TextView) findViewById(R.id.textBtn);

        bigboss = (ImageView) findViewById(R.id.bigboss);
        bigboss.startAnimation(smalltobig);

        textQuestion.setTypeface(typeface);
        textScreen.setTypeface(typeface);
        textTitle.setTypeface(typeface);
        textBtn.setTypeface(typeface);

        textBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(BossAct2.this,Level3.class);
                startActivity(a);
            }
        });

        textTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(BossAct2.this,MainActivity.class);
                startActivity(b);
            }
        });

    }}

