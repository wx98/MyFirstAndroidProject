package cn.wxxwwx98.testone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import cn.wxxwwx98.testone.util.PublicClass;
import cn.wxxwwx98.testone.util.ToastUitil;

public class ToastActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        getSupportActionBar().hide();

        btn1 =  findViewById(R.id.btn_toast_1);
        btn2 =  findViewById(R.id.btn_toast_2);
        btn3 =  findViewById(R.id.btn_toast_3);
        btn4 =  findViewById(R.id.btn_toast_4);
        setListeners();
    }

    private void setListeners() {
        onClick onClick = new onClick();
        btn1.setOnClickListener(onClick);
        btn2.setOnClickListener(onClick);
        btn3.setOnClickListener(onClick);
        btn4.setOnClickListener(onClick);
    }
    private class onClick implements View.OnClickListener{
        ToastUitil toastUitil = new ToastUitil();
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId())
            {
                case R.id.btn_toast_1:
                    Toast.makeText(ToastActivity.this, "Toast", Toast.LENGTH_LONG).show();
                    break;
                case R.id.btn_toast_2:
                    Toast toastCenter = Toast.makeText(ToastActivity.this, "居中Toast", Toast.LENGTH_LONG);
                    toastCenter.setGravity(Gravity.CENTER,0,0);
                    toastCenter.show();
                    break;
                case R.id.btn_toast_3:
                    Toast toastCustum = new Toast(getApplicationContext());

                    LayoutInflater inflater = LayoutInflater.from(ToastActivity.this);
                    View v = inflater.inflate(R.layout.lauout_toast,null);

                    ImageView im_toast = v.findViewById(R.id.iv_toast);
                    TextView tv_toast = v.findViewById(R.id.tv_toast);
                    im_toast.setImageResource(R.mipmap.ic_launcher);
                    tv_toast.setText("带图片的Tosat");
                    toastCustum.setView(v);
                    toastCustum.show();
                    break;
                case R.id.btn_toast_4:
                    toastUitil.showMsg(getApplicationContext(),"封装过的Toast");
                    break;
            }
        }
    }
}
