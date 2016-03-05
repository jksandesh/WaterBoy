package com.example.sourabh.logreg;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread t =new Thread(){
            public  void run(){
                try{
                    sleep(4000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent i= new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(i);
                }
            }
        };

        t.start();

    }

    @Override
    protected  void onPause(){
        super.onPause();
        finish();
    }

}

