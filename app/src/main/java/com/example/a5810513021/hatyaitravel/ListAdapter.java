package com.example.a5810513021.hatyaitravel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by patho on 21/11/2560.
 */

public class ListAdapter extends BaseAdapter {
    private List<Place> placeList = new ArrayList<>();
    private Context context;
    ListAdapter(Context context,List<Place> placeList){
        this.context = context;
        this.placeList = placeList;
    }
    @Override
    public int getCount() {
        if (placeList == null)
            return 0;
        return placeList.size();
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
        View view;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.list_item,parent,false);

        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        TextView tvName = (TextView) view.findViewById(R.id.tvName);


        imageView.setImageResource(placeList.get(position).getResId());
        tvName.setText(placeList.get(position).getName());


        return view;
    }
}
