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

import cn.wxxwwx98.testone.ImageviewActivity;
import cn.wxxwwx98.testone.R;

public class StaggeredAdapter extends RecyclerView.Adapter <StaggeredAdapter.LinearViewHolder>{
    @NonNull
    private Context mContext;
    private OnItemClickListener ClickListener;
    private OnItemLongClickListener LongListener;
    private List<String> list;
    public StaggeredAdapter(Context context, OnItemClickListener mlistener, OnItemLongClickListener mlongListener){
        this.mContext = context;
        this.ClickListener = mlistener;
        this.LongListener =  mlongListener;
    }
    @Override
    public StaggeredAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_staggered_grid_recyclerview_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StaggeredAdapter.LinearViewHolder viewHolder, final int i) {
        if (i%2 <= 0) {
            viewHolder.imageView.setImageResource(R.mipmap.image);
        } else if(i%3 <= 0) {
            viewHolder.imageView.setImageResource(R.mipmap.image_2);
//            https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1534042952167&di=8a057ce749af1c518ce3b216facb13ae&imgtype=0&src=http%3A%2F%2Fimg3.duitang.com%2Fuploads%2Fitem%2F201504%2F27%2F20150427220929_ZXRCk.jpeg
        }else{
            Glide.with(mContext).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1534042952167&di=8a057ce749af1c518ce3b216facb13ae&imgtype=0&src=http%3A%2F%2Fimg3.duitang.com%2Fuploads%2Fitem%2F201504%2F27%2F20150427220929_ZXRCk.jpeg").into(viewHolder.imageView);
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
    public int getItemCount() {
        return 30;
    }
    class LinearViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView= null;
        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);

        }
    }
    public interface OnItemClickListener{
        void onClick(int pos);
    }
    public interface OnItemLongClickListener{
        void onClick(int pos);
    }
}
