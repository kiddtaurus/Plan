package com.example.crazy.plan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.crazy.plan.model.Place;
import com.example.crazy.plan.model.Student;

import java.util.ArrayList;

public class PlaceListActivity extends AppCompatActivity {

    ListView listView;
    PlaceListAdapter placeListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_list);


        listView = (ListView) findViewById(R.id.listV_content);

        // 假数据
        ArrayList<Place> places = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Place place = new Place();
            place.setPlaceId(i + 1);
            place.setAddr("Place" + i + " ");

            places.add(place);
        }

        placeListAdapter = new PlaceListAdapter(this, places);
        listView.setAdapter(placeListAdapter);
    }
}
