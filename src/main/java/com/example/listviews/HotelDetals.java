package com.example.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import model.aboutHotel;

public class HotelDetals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_detals);
        Intent intent = getIntent();
        int id = (int) intent.getExtras().get("hotel_id");

        aboutHotel hotels = aboutHotel.hotel[id];
        ImageView img = findViewById(R.id.imgs);
        img.setImageResource(hotels.getImg());

        TextView texts1=findViewById(R.id.text1);
        TextView texts2 = findViewById(R.id.text2);
        texts1.setText(hotels.getName());
        texts2.setText(hotels.getDes());
    }
}