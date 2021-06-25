package com.example.callmydoctors.AllActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.callmydoctors.R;

public class BookAnAppointmentActivity extends AppCompatActivity {

    Button bookApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_an_appointment);
        bookApp=findViewById(R.id.book_Appointment);

        bookApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BookAnAppointmentActivity.this,PaymentActivity.class));
            }
        });
    }
}