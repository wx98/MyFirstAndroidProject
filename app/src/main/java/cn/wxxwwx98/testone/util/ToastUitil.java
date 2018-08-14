package cn.wxxwwx98.testone.util;

import android.content.Context;
import android.widget.Toast;

public class ToastUitil {
    public  static Toast mToast;
    public ToastUitil(){

    }

    public static ToastUitil showMsg(Context context, String msg){
        if (mToast == null){
            mToast = Toast.makeText(context,msg,Toast.LENGTH_LONG);
        }
        else {
            mToast.setText(msg);
        }
        mToast.show();
        return null;
    }
}
