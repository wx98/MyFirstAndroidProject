package cn.wxxwwx98.testone.listview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import cn.wxxwwx98.testone.R;

public class ListViewActivity extends Activity {
    private ListView mLt1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        mLt1 = findViewById(R.id.lv_1);
        mLt1.setAdapter(new MyListAdapter(ListViewActivity.this));
        mLt1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this,"点击pos:"+i,Toast.LENGTH_SHORT).show();
            }
        });
        mLt1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this,"长按pos:"+i,Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
