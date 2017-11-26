package com.example.crazy.plan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.crazy.plan.model.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listV_content);

        // 假数据
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Student student = new Student();
            student.setAge(i);
            student.setName("Student" + i);
            student.setSex("M");

            students.add(student);
        }

        listAdapter = new ListAdapter(this, students);
        listView.setAdapter(listAdapter);

        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlaceListActivity.class);
                startActivity(intent);
            }
        });

        Button btnSite = (Button)findViewById(R.id.btnSite);
        btnSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SiteActivity.class);
                startActivity(intent);
            }
        });
    }
}
