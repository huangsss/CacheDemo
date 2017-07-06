package com.example.huangj.retrofit1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.huangj.retrofit1.R;
import com.example.huangj.retrofit1.entity.HomeEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/16.17:46
 */

public class HomeAdapter extends BaseAdapter {

    private Context context;
    private List<HomeEntity.DataBean.RowsBean> datas;

    public HomeAdapter(Context context) {
        this.context = context;
        this.datas = new ArrayList<>();
    }

    public void setDatas(List<HomeEntity.DataBean.RowsBean> datas) {
        this.datas = datas;
        this.notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView != null) {
            viewHolder = (ViewHolder) convertView.getTag();
        } else {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_listview,null);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.src);
            viewHolder.tv1 = (TextView) convertView.findViewById(R.id.textView1);
            viewHolder.tv2 = (TextView) convertView.findViewById(R.id.textView2);
            convertView.setTag(viewHolder);
        }
        if (datas!=null){
            viewHolder.tv1.setText(datas.get(position).getTitle());
            viewHolder.tv2.setText("-"+datas.get(position).getClass_name()+"-");
            Glide.with(context).load(datas.get(position).getPoster_img())
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .crossFade()
                    .thumbnail(0.1f)
                    .into(viewHolder.imageView);
        }
        return convertView;
    }


    class ViewHolder {
        ImageView imageView;
        TextView tv1, tv2;
    }

}
