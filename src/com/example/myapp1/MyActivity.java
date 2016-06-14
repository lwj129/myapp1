package com.example.myapp1;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    Button btn_alpha,btn_scale,btn_rotate,btn_translate,btn_loading;
    ImageView iv_animation,iv_anim;
    @Override


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn_alpha=(Button)findViewById(R.id.btn_alpha);
        btn_scale=(Button)findViewById(R.id.btn_scale);
        btn_rotate=(Button)findViewById(R.id.btn_rotate);
        btn_translate=(Button)findViewById(R.id.btn_translate);
        btn_loading=(Button)findViewById(R.id.btn_loading);
        iv_animation=(ImageView)findViewById(R.id.iv_animation);
        iv_anim=(ImageView)findViewById(R.id.iv_anim);
        btn_alpha.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Animation alphaAnimation= AnimationUtils.loadAnimation(MyActivity.this,R.anim.alpha_animation);
                iv_animation.startAnimation(alphaAnimation);
            }
        });
        btn_scale.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Animation scaleAnimation=AnimationUtils.loadAnimation(MyActivity.this,R.anim.scale_animation);
                iv_animation.startAnimation(scaleAnimation);
            }
        });
        btn_rotate.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Animation rotateAnimation=AnimationUtils.loadAnimation(MyActivity.this,R.anim.rotate_animation);
                rotateAnimation.setFillAfter(true);
                iv_animation.startAnimation(rotateAnimation);
            }
        });
        btn_translate.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Animation translateAnimation=AnimationUtils.loadAnimation(MyActivity.this,R.anim.translate_animation);
                iv_animation.startAnimation(translateAnimation);
            }
        });
        btn_loading.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                iv_anim.setImageResource(R.drawable.loading_animation);
                AnimationDrawable animationDrawable=(AnimationDrawable)iv_anim.getDrawable();
                animationDrawable.start();
            }
        });
    }
}
