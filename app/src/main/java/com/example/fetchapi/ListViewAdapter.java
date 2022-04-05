package com.example.fetchapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;
/*
 *DhruvKumar Patel
 */
public class ListViewAdapter extends ArrayAdapter<Data> {
    private List<Data> dataList;
    private Context context;
    public ListViewAdapter(List<Data> dataList, Context context) {
        super(context, R.layout.list_items, dataList);
        this.dataList = dataList;
        this.context = context;
    }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = LayoutInflater.from(context);

            View listViewItem = inflater.inflate(R.layout.list_items, null, true);

            TextView textViewId = listViewItem.findViewById(R.id.userId);
            TextView textViewEmail = listViewItem.findViewById(R.id.userEmail);
            TextView textViewFirstName = listViewItem.findViewById(R.id.userFirstName);
            TextView textViewLastName = listViewItem.findViewById(R.id.userLastName);

            Data data = dataList.get(position);

            textViewId.setText(data.getId());
            textViewEmail.setText(data.getEmail());
            textViewFirstName.setText(data.getFirstName());
            textViewLastName.setText(data.getLastName());

            return listViewItem;
        }
    }
