package cn.wxxwwx98.testone.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import cn.wxxwwx98.testone.R;

public class HorRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mrvHor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hor_recycler_view);
        mrvHor = findViewById(R.id.rv_hor);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(HorRecyclerViewActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mrvHor.setLayoutManager(linearLayoutManager);
        mrvHor.setAdapter(
                new HorAdapter(HorRecyclerViewActivity.this,
                new HorAdapter.OnItemClickListener() {
                    @Override
                    public void onClick(int pos) {
                        Toast.makeText(HorRecyclerViewActivity.this, "点击....." + pos, Toast.LENGTH_SHORT).show();
                    }
                }
                ,
                new HorAdapter.OnItemLongClickListener() {
                    @Override
                    public void onClick(int pos) {
                        Toast.makeText(HorRecyclerViewActivity.this, "长按....." + pos, Toast.LENGTH_SHORT).show();
                    }
                }
        ));
    }
}
