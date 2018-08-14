package cn.wxxwwx98.testone.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Toast;

import cn.wxxwwx98.testone.R;

public class PurRecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mRvPu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pur_recycler_view);
        mRvPu = findViewById(R.id.rv_pu);
        mRvPu.setLayoutManager(new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL));
        mRvPu.setAdapter(
                new StaggeredAdapter(
                        PurRecyclerViewActivity.this,
                        new StaggeredAdapter.OnItemClickListener() {
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(PurRecyclerViewActivity.this, "点击....." + pos, Toast.LENGTH_SHORT).show();
                            }
                        },
                        new StaggeredAdapter.OnItemLongClickListener() {
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(PurRecyclerViewActivity.this, "长按....." + pos, Toast.LENGTH_SHORT).show();
                            }
                        }
                ));
    }
}
