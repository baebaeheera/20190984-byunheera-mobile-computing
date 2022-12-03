package com.example.mobilecomputing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Button;

public class loginActivity extends Activity {

    Button gomain2;
    Button gosignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        gomain2 = findViewById(R.id.gomain2);

        gomain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                gosignup = findViewById(R.id.gosignup);

                gosignup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), signupActivity.class);
                        startActivity(intent);

                    }

                    ;
                });
            }
        });
    }
}
