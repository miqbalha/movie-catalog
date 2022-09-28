package com.example.animonstaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.animonsta.R;

public class tentang extends AppCompatActivity {
    private String title = "About";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setActionBarTitle(title);
    }
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
