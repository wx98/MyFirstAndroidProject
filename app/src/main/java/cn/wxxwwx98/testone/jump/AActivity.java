package cn.wxxwwx98.testone.jump;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cn.wxxwwx98.testone.R;

public class AActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        btn1 = findViewById(R.id.btn_jump1);
        btn2 = findViewById(R.id.btn_jump2);
        btn3 = findViewById(R.id.btn_jump3);
        btn4 = findViewById(R.id.btn_jump4);
        btn5 = findViewById(R.id.btn_jump5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显式1
                Intent intent = new Intent(AActivity.this,BActivity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显式2
                Intent intent =new Intent();
                intent.setClass(AActivity.this,BActivity.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显式3
                Intent intent =new Intent();
                intent.setClassName(AActivity.this,"cn.wxxwwx98.testone.jump.BActivity");
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显式4
                Intent intent =new Intent();
                intent.setComponent(new ComponentName(AActivity.this,"cn.wxxwwx98.testone.jump.BActivity"));
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //隐式1
                Intent intent =new Intent();
                intent.setAction("cn.wxxwwx98.testone.jump.textBActivity");
                startActivity(intent);
            }
        });

    }


}
