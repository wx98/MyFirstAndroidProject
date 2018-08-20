package cn.wxxwwx98.testone.single;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import cn.wxxwwx98.testone.R;

public class twoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Log.d("twoActivity", "-------onCreate:------- ");
        Log.d("twoActivity", "onCreate: "+getTaskId()+",\nhash:"+hashCode());
        logtaskName();

    }
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("twoActivity", "-------onNewIntent:------- ");
        Log.d("twoActivity", "onCreate: "+getTaskId()+",\nhash:"+hashCode());
        logtaskName();
    }

    private  void logtaskName(){
        try {
            ActivityInfo info = getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
            Log.d("twoActivity",info.taskAffinity);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
