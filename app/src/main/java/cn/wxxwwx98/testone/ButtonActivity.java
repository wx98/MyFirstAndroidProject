package cn.wxxwwx98.testone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import cn.wxxwwx98.testone.util.PublicClass;

public class ButtonActivity extends AppCompatActivity {
    private Button btn3;
    private TextView Tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        getSupportActionBar().hide();


        btn3 = findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this,"运行了btn_3的点击事件",Toast.LENGTH_SHORT).show();
            }
        });
        Tv5 = findViewById(R.id.tv_8);
        Tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this,"运行了TextView_8的点击事件",Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void showToast(View view) {
        Toast.makeText(this,"运行了btn_4的点击事件",Toast.LENGTH_SHORT).show();
    }
}
