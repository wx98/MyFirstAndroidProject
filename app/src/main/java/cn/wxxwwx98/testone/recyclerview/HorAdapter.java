package cn.wxxwwx98.testone.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import cn.wxxwwx98.testone.R;

public class HorAdapter extends RecyclerView.Adapter <HorAdapter.LinearViewHolder>{
    @NonNull
    private Context mContext;
    private OnItemClickListener ClickListener;
    private OnItemLongClickListener LongListener;
    private List<String> list;
    public HorAdapter(Context context, OnItemClickListener mlistener, OnItemLongClickListener mlongListener){
        this.mContext = context;
        this.ClickListener = mlistener;
        this.LongListener =  mlongListener;
    }
    @Override
    public HorAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_hor_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HorAdapter.LinearViewHolder viewHolder, final int i) {
        viewHolder.textView.setText("设置的标题");
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickListener.onClick(i);
            }
        });
        viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                LongListener.onClick(i);
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }
    class LinearViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);

        }
    }
    public interface OnItemClickListener{
        void onClick(int pos);
    }
    public interface OnItemLongClickListener{
        void onClick(int pos);
    }
}
