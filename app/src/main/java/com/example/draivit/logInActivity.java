package com.example.draivit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Map;

public class logInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //    Button logInbtn = (Button) findViewById(R.id.loginBtn);
           // logInbtn.setOnClickListener(loginOnClick(null));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void loginOnClick(View view)
    {

        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        // myIntent.putExtra("key", value); //Optional parameters
        logInActivity.this.startActivity(myIntent);
    }
}
