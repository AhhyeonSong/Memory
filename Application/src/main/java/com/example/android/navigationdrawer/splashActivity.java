package com.example.android.navigationdrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by appcreator27 on 2016. 9. 6..
 */
public class splashActivity extends Activity {
//    int SPLASH_TIME=2000;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.splash_layout);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                overridePendingTransition(0,android.R.anim.fade_in);
//                startActivity(new Intent(splashActivity.this,MainActivity.class));
//                finish();
//            }
//        },SPLASH_TIME);
//
//    }
@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.splash_layout);
    Handler hd = new Handler();
    hd.postDelayed(new splashhandler() , 3000); // 3초 후에 hd Handler 실행
}

    private class splashhandler implements Runnable{
        public void run() {
            startActivity(new Intent(getApplication(), MainActivity.class)); // 로딩이 끝난후 이동할 Activity
            splashActivity.this.finish(); // 로딩페이지 Activity Stack에서 제거
        }
    }
}
