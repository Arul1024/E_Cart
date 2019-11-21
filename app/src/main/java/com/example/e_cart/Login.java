package com.example.e_cart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private Double mobileNo;
    private TextInputLayout otpLayout;
    private TextInputEditText otpInp;
    private Button next,resend;
    private FrameLayout otpFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        otpFrame = findViewById(R.id.otpFrame);

        otpInp = findViewById(R.id.otpValidate);
        next = findViewById(R.id.checkNo);
        next.setOnClickListener(this);
        resend = findViewById(R.id.checkNo);
        resend.setOnClickListener(this);

        otpInp.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (otpInp.getText().toString().length() > 5){
                    otpInp.setError("OTP No must be 5 digit");
                }
            }
        });

    }

    /** Clicking Event For All UI Functions in Login Activity */
    @Override
    public void onClick(View v) {
        if (v == next){
            Log.d("","- - - - - - - Triggered Next Button - - - - - - - - -");
            if (otpInp.getText().toString().length() < 5){
                otpInp.setError("Invalid");
            }else{
                Toast.makeText(getApplication().getBaseContext(),"Getting OTP",Toast.LENGTH_LONG);
                Log.d("Loader Message ","Getting otp for the validation");

                startActivity(new Intent(getBaseContext(), ShowItems.class));
            }
        }
        if (v == resend){
            Toast.makeText(getApplicationContext(),"Resend Otp", Toast.LENGTH_LONG);
        }
    }
}
