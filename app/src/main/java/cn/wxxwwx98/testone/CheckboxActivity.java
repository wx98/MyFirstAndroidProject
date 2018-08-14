package cn.wxxwwx98.testone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckboxActivity extends AppCompatActivity {
    private CheckBox cb_5,cb_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        getSupportActionBar().hide();

        cb_5 = findViewById(R.id.cb_5);
        cb_6 = findViewById(R.id.cb_6);

        cb_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(CheckboxActivity.this, b?"选中 cb_5":"取消选中 cb_5", Toast.LENGTH_SHORT).show();
            }
        });
        cb_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(CheckboxActivity.this, b?"选中 cb_6":"取消选中 cb_6", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
