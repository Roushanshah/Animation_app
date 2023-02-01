package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void fade(View view) {
        ImageView tesla = (ImageView) findViewById(R.id.tesla);
        ImageView item = (ImageView) findViewById(R.id.item);
        tesla.animate().alpha(0f).setDuration(2000);
        item.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}