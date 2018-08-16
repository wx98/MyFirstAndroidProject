package cn.wxxwwx98.testone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import cn.wxxwwx98.testone.util.ToastUitil;

public class PopupWindowActivity extends AppCompatActivity {
    private Button mBtnPop;
    private PopupWindow mPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_window);
        getSupportActionBar().hide();

        mBtnPop = findViewById(R.id.btn_pop);
        mBtnPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = getLayoutInflater().inflate(R.layout.layout_pop,null);
                mPop = new PopupWindow(view,200,ViewGroup.LayoutParams.WRAP_CONTENT);
                TextView textView = view.findViewById(R.id.tv_good);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mPop.dismiss();
                        ToastUitil.showMsg(PopupWindowActivity.this,"点击了好！");
                    }
                });
                TextView textView2 = view.findViewById(R.id.tv_oh);
                textView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mPop.dismiss();
                        ToastUitil.showMsg(PopupWindowActivity.this,"点击了还行！");
                    }
                });
                TextView textView3 = view.findViewById(R.id.tv_no);
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mPop.dismiss();
                        ToastUitil.showMsg(PopupWindowActivity.this,"点击了不好！");
                    }
                });
                mPop = new PopupWindow(view,mBtnPop.getWidth(), ViewGroup.LayoutParams.WRAP_CONTENT);
                mPop.setFocusable(true);
                mPop.setOutsideTouchable(true);
                mPop.showAsDropDown(mBtnPop);
            }
        });
    }
}
