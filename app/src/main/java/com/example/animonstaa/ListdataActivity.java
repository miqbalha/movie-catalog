package com.example.animonstaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.animonsta.R;

public class ListdataActivity extends AppCompatActivity {
TextView name,deskrip;
ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdata);

        name = findViewById(R.id.namae);
        deskrip = findViewById(R.id.detaile);
        image = findViewById(R.id.imageView);

        Intent intent = getIntent();

        image.setImageResource(intent.getIntExtra("image", 0));
        name.setText(intent.getStringExtra("name"));
        deskrip.setText(intent.getStringExtra("desk"));

    }
}
