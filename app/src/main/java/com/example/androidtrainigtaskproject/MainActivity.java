package com.example.androidtrainigtaskproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private ListView listItem;
    private FloatingActionButton btn_add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItem = findViewById(R.id.listItem);
        btn_add = findViewById((R.id.add_btn1));
//-4024195
//-12632256
//-6738689
        ArrayList<Task> array_task = new ArrayList<>();
        array_task.add(new Task("Task 1","orem Ipsum is simply dummy text of the printing and typesetting",-12632256));
        array_task.add(new Task("Task 2","orem Ipsum is simply dummy text of the printing and typesetting",-4024195));
        array_task.add(new Task("Task 3","orem Ipsum is simply dummy text of the printing and typesetting",-6738689));
        array_task.add(new Task("Task 4","orem Ipsum is simply dummy text of the printing and typesetting",-12632256));
        array_task.add(new Task("Task 5","orem Ipsum is simply dummy text of the printing and typesetting",-4024195));
        array_task.add(new Task("Task 6","orem Ipsum is simply dummy text of the printing and typesetting",-12632256));
        array_task.add(new Task("Task 7","orem Ipsum is simply dummy text of the printing and typesetting",-6738689));
        array_task.add(new Task("Task 8","orem Ipsum is simply dummy text of the printing and typesetting",-12632256));
        array_task.add(new Task("Task 9","orem Ipsum is simply dummy text of the printing and typesetting",-4024195));
        array_task.add(new Task("Task 10","orem Ipsum is simply dummy text of the printing and typesetting",-6738689));

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,AddActivity.class);
                startActivity(i);

            }
        });
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