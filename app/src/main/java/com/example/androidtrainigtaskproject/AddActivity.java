package com.example.androidtrainigtaskproject;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import petrov.kristiyan.colorpicker.ColorPicker;

public class AddActivity extends AppCompatActivity {

    private Button add_btn, btn_color;
    private EditText name_ed, desc_ed;
    private ColorPicker colorPicker;
    private Task task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        add_btn = findViewById(R.id.add_button);
        name_ed = findViewById(R.id.task_name_add);
        desc_ed = findViewById(R.id.task_description_add);
        btn_color = findViewById(R.id.btn_color);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if  (name_ed.getText().equals("") || desc_ed.getText().equals(""))
               {
                   Toast.makeText(AddActivity.this, "Enter missing data", Toast.LENGTH_SHORT).show();
               }
               else
               {
                   TaskSqlLiteDatabase t = new TaskSqlLiteDatabase(AddActivity.this);
                    task = new Task(name_ed.getText().toString(),desc_ed.getText().toString());
                   t.CreateTask(task);
                   Toast.makeText(AddActivity.this, "Task created", Toast.LENGTH_SHORT).show();
               }
            }
        });

        btn_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorPicker = new ColorPicker(AddActivity.this);
                colorPicker.show();
                colorPicker.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {
                        Toast.makeText(AddActivity.this, "Color " + color, Toast.LENGTH_SHORT).show();
                        task.setColor(color);
                    }

                    @Override
                    public void onCancel() {
                                // put code
                    }
                });
            }
        });
    }
}
