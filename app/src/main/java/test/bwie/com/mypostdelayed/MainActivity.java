package test.bwie.com.mypostdelayed;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Handler handler=new Handler(){};

    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            //两秒实现一次的定时器操作
            handler.postDelayed(this,2000);
            Log.i("吃货","大吃货");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2秒计时
        handler.postDelayed(runnable,2000);
    }
}
