package cn.wxxwwx98.testone;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cn.wxxwwx98.testone.util.ToastUitil;

public class DialogActivity extends AppCompatActivity {
    private Button mBtnDialog1,mBtnDialog2,mBtnDialog3,mBtnDialog4,mBtnDialog5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        getSupportActionBar().hide();

        mBtnDialog1 = findViewById(R.id.btn_dialog1);
        mBtnDialog2 = findViewById(R.id.btn_dialog2);
        mBtnDialog3 = findViewById(R.id.btn_dialog3);
        mBtnDialog4 = findViewById(R.id.btn_dialog4);
        mBtnDialog5= findViewById(R.id.btn_dialog5);
        OnClick onClick = new OnClick();
        mBtnDialog1.setOnClickListener(onClick);
        mBtnDialog2.setOnClickListener(onClick);
        mBtnDialog3.setOnClickListener(onClick);
        mBtnDialog4.setOnClickListener(onClick);
        mBtnDialog5.setOnClickListener(onClick);
    }
    class OnClick implements View.OnClickListener{
        /**
         * Called when a view has been clicked.
         *
         * @param v The view that was clicked.
         */
        @Override
        public void onClick(View v) {
         switch (v.getId()){
             case R.id.btn_dialog1:
                 AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
                 builder .setTitle("请回答")
                         .setMessage("你觉得课程如何？")
                         .setIcon(R.drawable.ic_launcher_foreground_start_image)
                         .setPositiveButton("(๑•̀ㅂ•́)و✧棒", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 ToastUitil.showMsg(DialogActivity.this,"你很诚实！");
                             }
                         })
                         .setNeutralButton("海星海星！", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 ToastUitil.showMsg(DialogActivity.this,"你再看看~~");
                             }
                         })
                         .setNegativeButton("不行", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 ToastUitil.showMsg(DialogActivity.this,"瞎说");
                             }
                         })
                         .show();
                break;
             case R.id.btn_dialog2:
                 final String[]  array2 = new String[]{"男","女"};
                 AlertDialog.Builder builder2 = new AlertDialog.Builder(DialogActivity.this);
                 builder2.setTitle("选择性别")
                         .setItems(array2, new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 ToastUitil.showMsg(DialogActivity.this,array2[which]);
                             }
                         })
                         .show();
                 break;
             case R.id.btn_dialog3:
                 final String[]  array3 = new String[]{"男","女"};
                 AlertDialog.Builder builder3 = new AlertDialog.Builder(DialogActivity.this);
                 builder3.setTitle("选择性别")
                         .setCancelable(false)
                         .setSingleChoiceItems(array3, 1, new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 ToastUitil.showMsg(DialogActivity.this,array3[which]);
                                 dialog.dismiss();
                             }
                         })
                         .show();
                 break;
             case R.id.btn_dialog4:
                 final String[]  array4 = new String[]{"唱歌","跳舞","打代码"};
                 final boolean [] isSelected = new boolean[]{false,false,true};
                 AlertDialog.Builder builder4 = new AlertDialog.Builder(DialogActivity.this);
                 builder4.setTitle("喜欢干什么？")
                         .setMultiChoiceItems(array4, isSelected, new DialogInterface.OnMultiChoiceClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                 ToastUitil.showMsg(DialogActivity.this,array4[which]+":"+isChecked);
                             }
                         })
                         .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 ToastUitil.showMsg(DialogActivity.this,array4[0]+":"+isSelected[0]+"\n"+array4[1]+":"+isSelected[1]+"\n"+array4[2]+":"+isSelected[2]);
                             }
                         })
                         .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 ToastUitil.showMsg(DialogActivity.this,"你取消了！");
                             }
                         })
                         .show();
                 break;
             case R.id.btn_dialog5:
                 AlertDialog.Builder builder5 = new AlertDialog.Builder(DialogActivity.this);
                 View view = LayoutInflater.from(DialogActivity.this).inflate(R.layout.layout_dialog,null);
                 EditText etUserName = view.findViewById(R.id.et_username),
                         et_PassWord = view.findViewById(R.id.et_password);
                 Button btnLoglin= view.findViewById(R.id.btn_login);
                 btnLoglin.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         ToastUitil.showMsg(DialogActivity.this,"登陆成功!");
                     }
                 });
                 builder5.setTitle("请先登录")
                         .setView(view)
                         .show();
                 break;
         }
        }
    }
}
