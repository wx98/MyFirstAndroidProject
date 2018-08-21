package cn.wxxwwx98.testone.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import cn.wxxwwx98.testone.R;

public class AFragment extends Fragment {
    private TextView mtv;
//    private Activity mActivity;
    private Button mBtnChange;
    private Button mBtnReset;
    private Button mBtnMessage;
    private Button mBtnMessage2;
    private BFragment bFragment;
    private IOnMessageClick listener;


    public static AFragment newInstance(String s){
        AFragment fragment = new AFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title",s);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_a,container,false);
//        return super.onCreateView(inflater, container, savedInstanceState);
        Log.d("AFragment ","-----onCreateView----");
        return  view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mtv = view.findViewById(R.id.tv_title);
        mBtnChange = view.findViewById(R.id.btn_change);
        mBtnReset = view.findViewById(R.id.btn_reset);
        mBtnMessage = view.findViewById(R.id.btn_message);
        mBtnMessage2 = view.findViewById(R.id.btn_message2);
        mBtnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bFragment == null)bFragment = new BFragment();
                Fragment fragment = getFragmentManager().findFragmentByTag("a");
                if(fragment != null){
                    getFragmentManager().beginTransaction().hide(fragment).add(R.id.fl_container,bFragment).addToBackStack(null).commitAllowingStateLoss();
                }else{
                    getFragmentManager().beginTransaction().replace(R.id.fl_container,bFragment).addToBackStack(null).commitAllowingStateLoss();

                }
            }
        });
        mBtnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((ContainerActivity)getActivity()).setData("这是来自AFragment的参数1");
            }
        });
        mBtnMessage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ((ContainerActivity)getActivity()).setData("这是来自AFragment的参数");
                listener.onClick("这是来自AFragment的参数2");
            }
        });

        mBtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtv.setText("新参数！");

            }
        });

        if(getArguments() != null){
            mtv.setText(getArguments().getString("title"));
        }

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            listener = (IOnMessageClick) context;
        }catch (ClassCastException e) {
            throw new ClassCastException("Activity 必须实现 IOnMessageClick 接口");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    //接口
    public interface IOnMessageClick{
        void onClick(String text);
    }
}
