package com.ab.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String projectsArray[]={"POPULAR MOVIES","STOCK HAWK","BUILD IT BIGGER","MAKE YOUR APP MATERIAL","GO UBIQUITOUS","CAPSTONE"};
    List<String> listProjects;
    ListView listViewProjects;
    ProjectsAdapter mProjectsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewProjects=(ListView)findViewById(R.id.listViewProjects);
        listProjects= new ArrayList(Arrays.asList(projectsArray));
        mProjectsAdapter=new ProjectsAdapter(this,R.layout.list_item_projects,listProjects);
        listViewProjects.setAdapter(mProjectsAdapter);
    }
}
