package cn.wxxwwx98.testone;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadiobuttonActivity extends AppCompatActivity {

    private RadioGroup mrb_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);
        getSupportActionBar().hide();

        mrb_1 = findViewById(R.id.rg1);
        mrb_1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = radioGroup.findViewById(i);
                Toast.makeText(RadiobuttonActivity.this, "233"+radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
