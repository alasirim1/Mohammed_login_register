package com.example.mohammedasiri.Mohammed_login_register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class SignActivity extends AppCompatActivity {
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_screen);
        Bundle i = getIntent().getExtras();
        String text = i.getString ( "name" );
        final TextView text1 = (TextView) findViewById(R.id.textView7);
// Now set this value to EditText
       text1.setText ( text );

    }
}
