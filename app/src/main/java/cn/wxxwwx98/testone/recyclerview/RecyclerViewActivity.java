package cn.wxxwwx98.testone.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.wxxwwx98.testone.R;

public class RecyclerViewActivity extends AppCompatActivity {

    private Button mbtnLiner,mbtnHor,mbtnGrid,mbtnPu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mbtnLiner = findViewById(R.id.btn_liner);
        mbtnLiner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(RecyclerViewActivity.this,LinerRecycleViewActivity.class);
                startActivity(intent);
            }
        });
        mbtnHor = findViewById(R.id.btn_hor);
        mbtnHor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(RecyclerViewActivity.this,HorRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mbtnGrid = findViewById(R.id.btn_grid);
        mbtnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(RecyclerViewActivity.this,GridRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mbtnPu = findViewById(R.id.btn_pu);
        mbtnPu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(RecyclerViewActivity.this,PurRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

    }
}
