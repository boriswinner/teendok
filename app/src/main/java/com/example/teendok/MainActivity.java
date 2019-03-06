package com.example.teendok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView tasksRecyclerView;
    private RecyclerView.Adapter tasksRVAdapter;
    private RecyclerView.LayoutManager tasksLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tasksRecyclerView = findViewById(R.id.tasksRecyclerView);
        tasksRecyclerView.setHasFixedSize(true);
        tasksLayoutManager = new LinearLayoutManager(this);
        tasksRecyclerView.setLayoutManager(tasksLayoutManager);

        String[] myDataset = {"test", "test2", "elem", "русский язык", "ещё один элемент"};
        tasksRVAdapter = new MyAdapter(myDataset);
        tasksRecyclerView.setAdapter(tasksRVAdapter);
    }
}


