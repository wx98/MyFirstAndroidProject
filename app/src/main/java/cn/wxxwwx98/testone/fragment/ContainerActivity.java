package cn.wxxwwx98.testone.fragment;

import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.time.Instant;

import cn.wxxwwx98.testone.R;

public class ContainerActivity extends AppCompatActivity implements AFragment.IOnMessageClick{
    private Button btn1;
    private AFragment aFragment;
    private BFragment bFragment;
    private TextView mTvMessage;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
//        getSupportActionBar().hide();

        mTvMessage = findViewById(R.id.tv_message);
        //实例化AFragment
        aFragment = AFragment.newInstance("我是参数！！");
        //把AFragment添加到Activity中
        bFragment = new BFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fl_container, aFragment,"a").commitAllowingStateLoss();

        btn1 = findViewById(R.id.btn_change);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bFragment == null)bFragment = new BFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container,bFragment).commitAllowingStateLoss();

            }
        });

    }

    public void setData(String text){
        mTvMessage.setText(text);
    }

    @Override
    public void onClick(String text) {
        mTvMessage.setText(text);
    }
}
