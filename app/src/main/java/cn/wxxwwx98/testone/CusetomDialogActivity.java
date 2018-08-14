package cn.wxxwwx98.testone;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import cn.wxxwwx98.testone.util.ToastUitil;
import cn.wxxwwx98.testone.widgte.CustomDialog;

public class CusetomDialogActivity extends AppCompatActivity {
    private Button mDialog1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cusetom_dialog);
        getSupportActionBar().hide();

        mDialog1 = findViewById(R.id.btn_custom_dialog);
        mDialog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialog customDialog = new CustomDialog(CusetomDialogActivity.this) ;
                customDialog.setTitle("提示")
                        .setMessage("你要爱上我嘛٩(๑❛ᴗ❛๑)۶")
                        .setCancel("取消嘛", new CustomDialog.IOnCancelListener() {
                            @Override
                            public void onCancel(CustomDialog dialog) {
                                ToastUitil.showMsg(CusetomDialogActivity.this,"Cancel..........");
                                dialog.dismiss();
                            }
                        }).setConfirm("确认√", new CustomDialog.IOnConfirmLinstener() {
                            @Override
                            public void onConfirm(CustomDialog dialog) {
                                ToastUitil.showMsg(CusetomDialogActivity.this,"Confirm..........");
                                dialog.dismiss();
                            }
                        }).show();

            }
        });


    }
}
