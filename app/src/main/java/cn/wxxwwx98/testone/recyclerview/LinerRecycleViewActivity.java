package cn.wxxwwx98.testone.recyclerview;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.view.View;
import android.widget.Toast;

import cn.wxxwwx98.testone.R;

import static cn.wxxwwx98.testone.R.id.rv_main;

public class LinerRecycleViewActivity extends AppCompatActivity {
    private RecyclerView mRvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liner_recycle_view);
        getSupportActionBar().hide();

        mRvMain = findViewById(R.id.rv_main);
        mRvMain.setLayoutManager(new LinearLayoutManager(LinerRecycleViewActivity.this));
        mRvMain.addItemDecoration(new MyDecoration());
        mRvMain.setAdapter(
                new LinearAdapter(LinerRecycleViewActivity.this,
                new LinearAdapter.OnItemClickListener() {
                    @Override
                    public void onClick(int pos) {
                        Toast.makeText(LinerRecycleViewActivity.this, "点击....." + pos, Toast.LENGTH_SHORT).show();
                    }
                },
                new LinearAdapter.OnItemLongClickListener() {
                    @Override
                    public void onClick(int pos) {
                        Toast.makeText(LinerRecycleViewActivity.this, "长按....." + pos, Toast.LENGTH_SHORT).show();
                    }
             })
        );

    }
    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,0,getResources().getDimensionPixelOffset(R.dimen.divideright));
        }
    }
}
