package cn.wxxwwx98.testone.jump;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import cn.wxxwwx98.testone.R;

public class BActivity extends AppCompatActivity {


    private Button btn6,btn7;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        btn6 = findViewById(R.id.jump_data1);
        btn7 = findViewById(R.id.jump_data2);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Activity数据传送
                Intent intent = new Intent(BActivity.this,CActivity.class);
//                intent.putExtra();
                Bundle bundle = new Bundle();
                bundle.putString("name","数据传送1  B→C");
                bundle.putInt("number",11111111);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Activity数据传送
                Intent intent = new Intent(BActivity.this,CActivity.class);
//                intent.putExtra();
                Bundle bundle = new Bundle();
                bundle.putString("name","数据传送2 B→C");
                bundle.putInt("number",2222222);
                intent.putExtras(bundle);
                startActivityForResult(intent,2);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(BActivity.this,
                data.getExtras().getString("title")+"\n"+requestCode+"\n:"+resultCode,
                Toast.LENGTH_SHORT).show();
    }
}
