package cn.wxxwwx98.testone.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import cn.wxxwwx98.testone.R;
import cn.wxxwwx98.testone.gridvew.GridViewActivity;

public class GridRecyclerViewActivity extends AppCompatActivity {
    private  RecyclerView mRvGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycler_view);
        mRvGrid = findViewById(R.id.rv_grid);
        mRvGrid.setLayoutManager(new GridLayoutManager(GridRecyclerViewActivity.this,3));
        mRvGrid.setAdapter(
                new GridAdapter(
                        GridRecyclerViewActivity.this,
                        new GridAdapter.OnItemClickListener() {
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(GridRecyclerViewActivity.this, "点击....." + pos, Toast.LENGTH_SHORT).show();
                            }
                        }
                        ,
                        new GridAdapter.OnItemLongClickListener() {
                            @Override
                            public void onClick(int pos) {
                                Toast.makeText(GridRecyclerViewActivity.this, "长按....." + pos, Toast.LENGTH_SHORT).show();
                            }
                        }
                ));
    }
}
