package com.example.a1893955.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ListAdapt extends BaseAdapter {
    Context c;
    ArrayList<Products>prols;
    LayoutInflater inflator;

    public ListAdapt(Context c, ArrayList<Products> prols) {
        this.c = c;
        this.prols = prols;
    }

    @Override
    public int getCount() {
        return prols.size();
    }

    @Override
    public Object getItem(int position) {
        return prols.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflator==null)
        {
            inflator=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView==null)
        {
            convertView=inflator.inflate(R.layout.listitems,parent,false);
        }
        ImageView img=convertView.findViewById(R.id.imgproducts);
        TextView txtnm=convertView.findViewById(R.id.List);

        Picasso.get().load(prols.get(position).getPimgurl()).into(img);
        txtnm.setText(prols.get(position).getPproname());

        return null;
    }
}
