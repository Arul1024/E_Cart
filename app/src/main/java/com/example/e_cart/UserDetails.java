package com.example.e_cart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UserDetails extends AppCompatActivity implements View.OnClickListener {

    private Button next,skip;

    /*ACTION BAR VIEW LIST*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.userdetails_menu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        next = findViewById(R.id.udNext);
        next.setOnClickListener(this);
        skip = findViewById(R.id.udSkip);
        skip.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == next){
            Toast.makeText(getApplicationContext(),"on button click method",Toast.LENGTH_SHORT).show();
        }
        if (v == skip){
            Log.d("On Button Click","Skipped Registration");
            startActivity(new Intent(getBaseContext(), ShowItems.class));
        }
    }
}
