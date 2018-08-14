package cn.wxxwwx98.testone.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import cn.wxxwwx98.testone.R;

public class LinearAdapter extends RecyclerView.Adapter <RecyclerView.ViewHolder>{
    @NonNull
    private Context mContext;
    private OnItemClickListener ClickListener;
    private OnItemLongClickListener LongListener;
    private List<String> list;
    public LinearAdapter(Context context,OnItemClickListener mlistener,OnItemLongClickListener mlongListener){
        this.mContext = context;
        this.ClickListener = mlistener;
        this.LongListener =  mlongListener;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if(i == 0){
            return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item,viewGroup,false));
        }
        else{
            return new LinearViewHolder2(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item_2,viewGroup,false));
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        if (getItemViewType(i) == 0){
            ((LinearViewHolder)viewHolder).textView.setText("只有TextView的布局1");

        }else {
            ((LinearViewHolder2)viewHolder).textView.setText("有TextView和ImageView的布局2");
            ((LinearViewHolder2)viewHolder).imageView.setImageResource(R.mipmap.image);
        }
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
    public int getItemViewType(int position) {
        if(position %2 == 0){
            return 0;
        }else {
            return 1;
        }
//        return super.getItemViewType(position);
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
    class LinearViewHolder2 extends RecyclerView.ViewHolder{
        private TextView textView;
        private ImageView imageView;
        public LinearViewHolder2(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
            imageView = itemView.findViewById(R.id.iv_image);

        }
    }
    public interface OnItemClickListener{
        void onClick(int pos);
    }
    public interface OnItemLongClickListener{
        void onClick(int pos);
    }
}
