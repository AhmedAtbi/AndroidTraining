package com.example.androidtrainigtaskproject;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItem = findViewById(R.id.listItem);

        ArrayList<Task> array_task = new ArrayList<>();
        array_task.add(new Task("Task 1","orem Ipsum is simply dummy text of the printing and typesetting"));
        array_task.add(new Task("Task 2","orem Ipsum is simply dummy text of the printing and typesetting"));
        array_task.add(new Task("Task 3","orem Ipsum is simply dummy text of the printing and typesetting"));
        array_task.add(new Task("Task 4","orem Ipsum is simply dummy text of the printing and typesetting"));
        array_task.add(new Task("Task 5","orem Ipsum is simply dummy text of the printing and typesetting"));
        array_task.add(new Task("Task 6","orem Ipsum is simply dummy text of the printing and typesetting"));
        array_task.add(new Task("Task 7","orem Ipsum is simply dummy text of the printing and typesetting"));
        array_task.add(new Task("Task 8","orem Ipsum is simply dummy text of the printing and typesetting"));
        array_task.add(new Task("Task 9","orem Ipsum is simply dummy text of the printing and typesetting"));
        array_task.add(new Task("Task 10","orem Ipsum is simply dummy text of the printing and typesetting"));

        TaskAdapter adapter = new TaskAdapter(MainActivity.this,array_task);
        listItem.setAdapter(adapter);

        listItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Task taskItem = (Task) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "Item Click at position "+position+"\ntitle : "+taskItem.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });

        listItem.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Task taskItem = (Task) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "Item Long Click at position "+position+"\ntitle : "+taskItem.getTitle(), Toast.LENGTH_SHORT).show();


                return false;
            }
        });

    }
}