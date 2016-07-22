package com.ab.myappportfolio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

/**
 * Created by q4J1X056 on 23-07-2016.
 */
public class ProjectsAdapter extends ArrayAdapter<String> {
    public ProjectsAdapter(Context context, int resource) {
        super(context, resource);
    }

    public ProjectsAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view=convertView;
        if(view==null)
        {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item_projects, null);

        }

        Button listItemButton=(Button)view.findViewById(R.id.buttonListItemProject);
        listItemButton.setText(getItem(position));
        listItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"This button will launch my "+ getItem(position).toLowerCase()+" app!"
                        ,Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}
