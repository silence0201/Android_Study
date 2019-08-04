package com.silence.listview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class DataAdapter extends BaseAdapter {

    private Context context;
    private List<Data> data;
    private int layout;

    public DataAdapter(Context context, int layout,List<Data> data) {
        this.context = context;
        this.layout = layout;
        this.data = data;
    }


    @Override
    public int getCount() {
        return data == null ? 0 : data.size();
    }

    @Override
    public Data getItem(int position) {
        return data == null ? null : data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final Data item = getItem(position);

        ViewHolder viewHolder;
        View view;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(layout,parent,false);
            viewHolder.fruitImage = view.findViewById(R.id.headimage);
            viewHolder.fruitName = view.findViewById(R.id.headtext);
            viewHolder.fruitLayout = view.findViewById(R.id.ll_view);
            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.fruitImage.setImageResource(item.getImageID());
        viewHolder.fruitName.setText(item.getText());

        viewHolder.fruitLayout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Main2Activity.class);
                context.startActivity(intent);
            }
        });

        return view;
    }

    class ViewHolder {
        ImageView fruitImage;
        TextView fruitName;
        LinearLayout fruitLayout;
    }
}
