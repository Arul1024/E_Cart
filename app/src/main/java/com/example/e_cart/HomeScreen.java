package com.example.e_cart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class HomeScreen extends AppCompatActivity implements View.OnClickListener {

    private Double mobileNo;
    private TextInputLayout mobileNoLayout;
    private TextInputEditText mobileNoInp;
    private ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        mobileNoInp = findViewById(R.id.mobileno);

        next = findViewById(R.id.next);
        next.setOnClickListener(this);

        mobileNoInp.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (mobileNoInp.getText().toString().length() > 10){
                    mobileNoInp.setError("Mobile No must be 10 digit");
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v == next){
            Log.d("","- - - - - - - Triggered Next Button - - - - - - - - -");
            if (mobileNoInp.getText().toString().length() < 10){
                mobileNoInp.setError("Mobile No must be 10 digit");
            }else{
                Toast.makeText(HomeScreen.this,"Getting OTP",Toast.LENGTH_SHORT);
                startActivity(new Intent(getApplicationContext(), Login.class));
            }
        }
    }
}
