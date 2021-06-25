package com.example.callmydoctors.AllActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.callmydoctors.R;

public class DiagnosticTestActivity extends AppCompatActivity {

    ImageView diaBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostic_test);

        diaBack=findViewById(R.id.digBack);
        diaBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DiagnosticTestActivity.this,DashboardActivity.class));
            }
        });
    }
}