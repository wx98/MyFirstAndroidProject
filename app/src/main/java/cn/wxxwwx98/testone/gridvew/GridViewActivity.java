package cn.wxxwwx98.testone.gridvew;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import cn.wxxwwx98.testone.R;
import cn.wxxwwx98.testone.listview.ListViewActivity;


public class GridViewActivity extends AppCompatActivity {
    private GridView mgv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        getSupportActionBar().hide();
        mgv =findViewById(R.id.gv);
        mgv.setAdapter(new MyGridViewAdapter(GridViewActivity.this));
        mgv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this,"点击pos:"+position,Toast.LENGTH_SHORT).show();
            }
        });
        mgv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this,"长按pos:"+position,Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
