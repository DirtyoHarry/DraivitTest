package com.example.draivit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void signUpOnClick(View view)
    {
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        // myIntent.putExtra("key", value); //Optional parameters
        SignUpActivity.this.startActivity(myIntent);

    }
}
