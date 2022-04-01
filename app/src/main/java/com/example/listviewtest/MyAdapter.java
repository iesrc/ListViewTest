package com.example.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Data> {
    private int resourceId;
    public MyAdapter(Context context, int textViewResourceId, List<Data> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        Data data=getItem(position);
        View view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView image=(ImageView) view.findViewById(R.id.list_num);
        TextView name=(TextView)  view.findViewById(R.id.list_name);
        TextView index=(TextView)  view.findViewById(R.id.list_index);
        image.setImageResource(data.getNum());
        name.setText(data.getName());
        index.setText(data.getIndex());
        return view;
    }
}
