package cn.edu.gemec.s07105733.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called with:"+"");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called with"+"前台");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"失去控制权");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "懵逼");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart() called with"+"执行了");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy() called with:"+"哈哈哈");
        super.onDestroy();
    }
}
