package cn.wxxwwx98.testone;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cn.wxxwwx98.testone.gridvew.GridViewActivity;
import cn.wxxwwx98.testone.jump.AActivity;
import cn.wxxwwx98.testone.listview.ListViewActivity;
import cn.wxxwwx98.testone.recyclerview.RecyclerViewActivity;
import cn.wxxwwx98.testone.single.oneActivity;
import cn.wxxwwx98.testone.util.PublicClass;

public class MainActivity extends AppCompatActivity {

    private  Button btn1,btn2,btn3,btn4,btn5,
                    btn6,btn7,btn8,btn9,btn10,
                    btn11,btn12,btn13,btn14,btn15,
                    btn16,btn17,btn18,btn19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().hide();

        btn1 =  findViewById(R.id.btn_LinearLayout);
        btn2 =  findViewById(R.id.btn_RelativeLayout);
        btn3 =  findViewById(R.id.btn_TextView);
        btn4 =  findViewById(R.id.btn_Button);
        btn5 =  findViewById(R.id.btn_EditText);
        btn6 =  findViewById(R.id.btn_RadioButton);
        btn7 =  findViewById(R.id.btn_CheckBox);
        btn8 =  findViewById(R.id.btn_ImageView);
        btn9 =  findViewById(R.id.btn_ListView);
        btn10 = findViewById(R.id.btn_GridView);
        btn11 = findViewById(R.id.btn_RecyclerView);
        btn12 = findViewById(R.id.btn_WebView);
        btn13 = findViewById(R.id.btn_Toast);
        btn14 = findViewById(R.id.btn_AlertDialog);
        btn15 = findViewById(R.id.btn_CusetomDialog);
        btn16 = findViewById(R.id.btn_PopupWindow);
        btn17 = findViewById(R.id.btn_LifeCycleActivity);
        btn18 = findViewById(R.id.btn_JumpActivity);
        btn19 = findViewById(R.id.btn_LaunchMode);
        setListeners();

    }

    private void setListeners(){
        onClick onClick = new onClick();
        btn1.setOnClickListener(onClick);
        btn2.setOnClickListener(onClick);
        btn3.setOnClickListener(onClick);
        btn4.setOnClickListener(onClick);
        btn5.setOnClickListener(onClick);
        btn6.setOnClickListener(onClick);
        btn7.setOnClickListener(onClick);
        btn8.setOnClickListener(onClick);
        btn9.setOnClickListener(onClick);
        btn10.setOnClickListener(onClick);
        btn11.setOnClickListener(onClick);
        btn12.setOnClickListener(onClick);
        btn13.setOnClickListener(onClick);
        btn14.setOnClickListener(onClick);
        btn15.setOnClickListener(onClick);
        btn16.setOnClickListener(onClick);
        btn17.setOnClickListener(onClick);
        btn18.setOnClickListener(onClick);
        btn19.setOnClickListener(onClick);
    }
    private class onClick implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId())
            {
                case R.id.btn_LinearLayout:
                    intent = new Intent(MainActivity.this,LinearlayoutActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_RelativeLayout:
                    intent = new Intent(MainActivity.this,RelativelayoutActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_TextView:
                    intent = new Intent(MainActivity.this,TextviewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_Button:
                    intent = new Intent(MainActivity.this,ButtonActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_EditText:
                    intent = new Intent(MainActivity.this,EdittextActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_RadioButton:
                    intent = new Intent(MainActivity.this,RadiobuttonActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_CheckBox:
                    intent = new Intent(MainActivity.this,CheckboxActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_ImageView:
                    intent = new Intent(MainActivity.this,ImageviewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_ListView:
                    intent = new Intent(MainActivity.this,ListViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_GridView:
                    intent = new Intent(MainActivity.this,GridViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_RecyclerView:
                    intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_WebView:
                    intent = new Intent(MainActivity.this, WebViewActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_Toast:
                    intent = new Intent(MainActivity.this, ToastActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_AlertDialog:
                    intent = new Intent(MainActivity.this,DialogActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_CusetomDialog:
                    intent = new Intent(MainActivity.this,CusetomDialogActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_PopupWindow:
                    intent = new Intent(MainActivity.this,PopupWindowActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_LifeCycleActivity:
                    intent = new Intent(MainActivity.this,LifeCycleActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_JumpActivity:
                    intent = new Intent(MainActivity.this,AActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_LaunchMode:
                    intent = new Intent(MainActivity.this,oneActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }
    /**
     * 再按一次退出程序
     */
    private long lastBack = 0;
    @Override
    public void onBackPressed(){
        if (lastBack == 0 || System.currentTimeMillis() - lastBack > 2000) {
            Toast.makeText(MainActivity.this, "再按一次返回退出程序", Toast.LENGTH_SHORT).show();
            lastBack = System.currentTimeMillis();
            return;
        }
        super.onBackPressed();
    }
}
