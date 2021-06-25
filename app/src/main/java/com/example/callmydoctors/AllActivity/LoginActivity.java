package com.example.callmydoctors.AllActivity;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import android.widget.Button;
import android.widget.EditText;


import com.example.callmydoctors.R;
import com.google.android.material.button.MaterialButton;
import com.hbb20.CountryCodePicker;


public class LoginActivity extends AppCompatActivity {
Button save;
    EditText editText;
    CountryCodePicker countryCodePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_login);

        // hide the action bar


        editText = findViewById(R.id.edt_Text);
        countryCodePicker = findViewById(R.id.ccp);
        save = findViewById(R.id.btnCon);

        // for enablebutton whenever a user put 10 dgt the button is enable


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,NamesActivity.class));
            }
        });

    }


}