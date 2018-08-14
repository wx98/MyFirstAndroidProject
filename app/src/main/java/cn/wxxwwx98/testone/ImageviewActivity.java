package cn.wxxwwx98.testone;

import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.security.PublicKey;

public class ImageviewActivity extends AppCompatActivity {

    private ImageView Iv4,Iv5;
    private Button btnLaod;
    private EditText imsrc;
    private TextView log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);
        getSupportActionBar().hide();
        Iv4 = findViewById(R.id.iv_4);
        Iv5 = findViewById(R.id.iv_5);
        imsrc = findViewById(R.id.imsrc_1);
        btnLaod = findViewById(R.id.btnlaod_1);
        log = findViewById(R.id.returntext);

        Glide.with(this).load("http://image.yingyonghui.com/market/comment/20160213_5368995510958168790.jpg").into(Iv4);

        btnLaod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = Glide.with(ImageviewActivity.this).load(imsrc.getText().toString()).into(Iv5).toString();
                Toast.makeText(ImageviewActivity.this,"运行了加载"+imsrc.getText().toString()+"的事件.\n",Toast.LENGTH_SHORT).show();
                String y = imsrc.getText().toString();
                log.setText(x);
            }
        });

    }
    //状态栏沉浸
    @Override
    public void onWindowFocusChanged (boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus && Build.VERSION.SDK_INT >= 19) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }
}
