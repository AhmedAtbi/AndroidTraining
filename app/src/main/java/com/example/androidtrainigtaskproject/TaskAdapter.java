package com.example.androidtrainigtaskproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class TaskAdapter extends ArrayAdapter<Task> {
    public TaskAdapter(@NonNull Context context, @NonNull ArrayList<Task> objects) {
        super(context, R.layout.model_item, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.model_item,parent,false);

        TextView title = convertView.findViewById(R.id.note_title);
        TextView desc = convertView.findViewById(R.id.note_desc);

        Task task = getItem(position);
        title.setText(task.getTitle());
        desc.setText(task.getDesc());
        convertView.setBackgroundColor(task.getColor());

        return convertView;
    }
}
