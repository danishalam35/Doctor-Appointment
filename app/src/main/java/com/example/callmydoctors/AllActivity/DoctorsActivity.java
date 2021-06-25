package com.example.callmydoctors.AllActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.callmydoctors.R;

public class DoctorsActivity extends AppCompatActivity {
    ImageView ft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);
        ft=findViewById(R.id.docsrt);

        ft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorsActivity.this,MainActivity.class));
            }
        });
    }
}