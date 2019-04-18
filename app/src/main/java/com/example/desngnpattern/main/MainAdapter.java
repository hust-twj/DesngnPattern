package com.example.desngnpattern.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.desngnpattern.R;


import java.util.ArrayList;

/**
 * Created by Wenjing.Tang
 * on 2019/1/8
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{

    private Context mContext;
    private ArrayList<MainEntity> mDataList;

    public MainAdapter(Context context) {
        mContext = context;

        initData();
    }

    private void initData() {
        ArrayList<MainEntity> mDataList = new ArrayList<>();

        MainEntity entity5 = new MainEntity();
        entity5.index = MainEntity.INDEX_FACTORY_METHOD;
        entity5.title = "5 工厂方法模式";
        mDataList.add(entity5);


        setDataList(mDataList);
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_main_item,
                parent, false));
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder holder, final int position) {
        final MainEntity entity = mDataList.get(position);
        holder.mTvTitle.setText(entity.title);

        holder.mTvTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mClickListener != null) {
                    mClickListener.onClick(entity.index);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mDataList == null ? 0 : mDataList.size();
    }


    public void setDataList(ArrayList<MainEntity> dataList) {
        mDataList = dataList;
        notifyDataSetChanged();
    }

    public void addData(ArrayList<MainEntity> dataList) {
        mDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTvTitle;


        public ViewHolder(final View itemView) {
            super(itemView);
            mTvTitle = itemView.findViewById(R.id.tv_title);
        }
    }

    public void setOnlClickListener(OnClickListener listener) {
        mClickListener = listener;
    }

    private OnClickListener mClickListener;

    public interface OnClickListener {

        void onClick(int index);
    }

}
