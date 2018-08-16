package cn.wxxwwx98.testone.jump;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cn.wxxwwx98.testone.R;

public class CActivity extends AppCompatActivity {
    private TextView mTv;
    private Button mFinish;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        mTv = findViewById(R.id.tv_text);
        mFinish = findViewById(R.id.btn_finish);
        final Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        int number = bundle.getInt("number");
        mTv.setText(name + ","+number);

        mFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                Bundle bundle =new Bundle();
                bundle.putString("title","这个是B的值");
                intent.putExtras(bundle);
                setResult(AActivity.RESULT_OK,intent);
                finish();
            }
        });

    }
    public void onBackPressed() {
        Intent intent = new Intent();
        Bundle bundle =new Bundle();
        bundle.putString("title","这个是B的值");
        intent.putExtras(bundle);
        setResult(AActivity.RESULT_OK,intent);
        finish();
    }
}
