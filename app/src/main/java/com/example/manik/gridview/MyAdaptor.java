package com.example.manik.gridview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MyAdaptor extends BaseAdapter {

    Context ct;
    ArrayList<Integer> al;
    MyAdaptor(Context c)
    {
        ct=c;
        al = new ArrayList<>();
        addItem();
    }

    void addItem()
    {
        for(int i=0; i<15;i++)
        {
            al.add(R.drawable.lpu);
        }
    }
    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public Object getItem(int i) {
        return al.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Activity at = (Activity) ct;

        View v1 = at.getLayoutInflater().inflate(R.layout.my_adapter, null);


        ImageView iv = v1.findViewById(R.id.iv);


        iv.setImageResource((int)al.get(i));

        return v1;

    }
}
