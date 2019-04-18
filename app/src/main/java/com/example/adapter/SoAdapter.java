package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.giuaky.R;
import com.example.model.So;

import java.util.List;

public class SoAdapter extends ArrayAdapter<So> {
    Activity context;
    int resource;
    List<So> objects;
    public SoAdapter(Activity context, int resource, List<So> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }
    // theo quy trình tạo bộ 3 như trên , giống như contrucstor


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource,null);

        TextView itemKQ = row.findViewById(R.id.itemKQ);

        So so = this.objects.get(position);

        itemKQ.setText(so.getKq());

        return row;
    }
}
