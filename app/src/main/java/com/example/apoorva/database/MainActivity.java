package com.example.apoorva.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView lst;
    EditText student_id, student_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lst = findViewById(R.id.textView);
        student_id = findViewById(R.id.editText3);
        student_name = findViewById(R.id.editText2);
    }

    public void loadStudents(View view) {

        MyDBHandler dbHandler = new MyDBHandler(this);
        lst.setText(dbHandler.loadHandler());
        student_id.setText("");
        student_name.setText("");

    }

    public void addStudent(View view) {

        MyDBHandler dbHandler = new MyDBHandler(this);
        int id = Integer.parseInt(student_id.getText().toString());
        String name = student_name.getText().toString();
        dbHandler.addHandler(id,name);
        student_id.setText("");
        student_name.setText("");
    }
}

