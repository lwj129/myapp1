package com.example.myapp1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/26.
 */
public class PropetyActivity extends Activity {
    Button btn_alpha1,btn_scale1,btn_rotate1,btn_translate1,btn_loading1;
    ImageView iv_animation1;
    TextView tv_animation;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.propetyanim);
        btn_alpha1=(Button)findViewById(R.id.btn_alpha1);
        btn_scale1=(Button)findViewById(R.id.btn_scale1);
        btn_rotate1=(Button)findViewById(R.id.btn_rotate1);
        btn_translate1=(Button)findViewById(R.id.btn_translate1);
        btn_loading1=(Button)findViewById(R.id.btn_loading1);
        iv_animation1=(ImageView)findViewById(R.id.iv_animation1);
        tv_animation=(TextView)findViewById(R.id.tv_animation);
        btn_alpha1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                ObjectAnimator alphaAnimator=ObjectAnimator.ofFloat(iv_animation1,View.ALPHA,0.0f,1.0f);
                alphaAnimator.setDuration(3000);
                alphaAnimator.setRepeatCount(2);
                alphaAnimator.setRepeatMode(ObjectAnimator.REVERSE);
                alphaAnimator.start();
            }
        });
        btn_scale1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                ObjectAnimator scaleAnimator=ObjectAnimator.ofFloat(iv_animation1,View.SCALE_X,0.0f,2.0f,1.3f,1.0f);
                scaleAnimator.setDuration(5000);
                scaleAnimator.start();
            }
        });
        btn_rotate1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
               ObjectAnimator rotateAnimator=ObjectAnimator.ofFloat(iv_animation1,View.ROTATION_X,0.0f,320.f,0.0f);
                rotateAnimator.setDuration(5000);
                rotateAnimator.start();
            }
        });
        btn_translate1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                ObjectAnimator translateAnimator=ObjectAnimator.ofFloat(iv_animation1,View.TRANSLATION_X,0.0f,300.0f,200.0f,30.0f,0.0f);
                translateAnimator.setDuration(9000);
                translateAnimator.start();
            }
        });
        btn_loading1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
              /*   ObjectAnimator rgbAnimator=ObjectAnimator.ofInt(tv_animation,"BackgroundColor",0xffff00ff,0xff00ffff,0xffffff00,0xffabc123);
                rgbAnimator.setEvaluator(new ArgbEvaluator());
                rgbAnimator.setDuration(10000);
                rgbAnimator.start();*/
                AnimatorSet animatorSet=new AnimatorSet();
                List<Animator> list=new ArrayList<>();
                ObjectAnimator scaleXAnimator=ObjectAnimator.ofFloat(tv_animation,View.SCALE_X,0.0f,2.0f,1.0f);
                scaleXAnimator.setDuration(5000);
                ObjectAnimator scaleYAnimator=ObjectAnimator.ofFloat(tv_animation,View.SCALE_Y,0.0f,2.0f,1.0f);
                scaleYAnimator.setDuration(5000);
                ObjectAnimator rgbAnimator=ObjectAnimator.ofInt(tv_animation,"BackgroundColor",0xffff00ff,0xff00ffff,0xffffff00,0xffabc123);
                rgbAnimator.setEvaluator(new ArgbEvaluator());
                rgbAnimator.setDuration(10000);
                list.add(scaleXAnimator);
                list.add(scaleYAnimator);
                list.add(rgbAnimator);
                animatorSet.playTogether(list);
                animatorSet.start();
            }
        });
    }
}
