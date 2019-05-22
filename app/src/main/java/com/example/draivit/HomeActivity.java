package com.example.draivit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }

    public void loginOnClick (View view)
    {
        Intent myIntent = new Intent(getApplicationContext(), logInActivity.class);
        // myIntent.putExtra("key", value); //Optional parameters
        HomeActivity.this.startActivity(myIntent);
    }

    public void signupOnClick (View view)
    {
        Intent myIntent = new Intent(getApplicationContext(), SignUpActivity.class);
        // myIntent.putExtra("key", value); //Optional parameters
        HomeActivity.this.startActivity(myIntent);
    }
}
