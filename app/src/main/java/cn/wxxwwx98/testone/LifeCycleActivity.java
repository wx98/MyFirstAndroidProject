package cn.wxxwwx98.testone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import cn.wxxwwx98.testone.util.ToastUitil;

public class LifeCycleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d("LifeCycle", "---1onCreate--- ");
        Toast.makeText(LifeCycleActivity.this,"运行了onCreate.....",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "---onStart--- ");
        Toast.makeText(LifeCycleActivity.this,"运行了onStart.....",Toast.LENGTH_SHORT).show();
        //
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "---onResume--- ");
        //每次进入时执行
        Toast.makeText(LifeCycleActivity.this,"运行了onResume.....",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "---onPause--- ");
        //后台时执行
        Toast.makeText(LifeCycleActivity.this,"运行了onPause.....",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "---onStop--- ");
        //后台时执行
        Toast.makeText(LifeCycleActivity.this,"运行了onStop.....",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "---onRestart--- ");
        Toast.makeText(LifeCycleActivity.this,"运行了onRestart.....",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "---onDestroy--- ");
        //页面摧毁之前执行
        Toast.makeText(LifeCycleActivity.this,"运行了onDestroy.....",Toast.LENGTH_SHORT).show();
    }
}
