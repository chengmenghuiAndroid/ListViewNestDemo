package com.example.leishen.listviewnest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.example.leishen.listviewnest.R;
import com.example.leishen.listviewnest.utils.Utils;

/**
 * Created by leishen on 2016/10/28.
 */

public class ParentAdapter extends BaseAdapter {

    private static Context context;

    public ParentAdapter(Context context) {
        this.context = context ;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            holder = new ViewHolder();
            convertView =  LayoutInflater.from(context).inflate(R.layout.perent_listview_item, null);
            holder.sonListView_item = (ListView) convertView.findViewById(R.id.sonListView_item);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        SonAdapter sonAdapter = new SonAdapter(context);
        holder.sonListView_item.setAdapter(sonAdapter);
        Utils.setListViewHeight(holder.sonListView_item);
        return convertView;
    }

    class ViewHolder {
        private ListView sonListView_item;
    }



}
