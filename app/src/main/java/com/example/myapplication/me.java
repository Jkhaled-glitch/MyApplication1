package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class me extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.me);
        Intent i = getIntent();
        String me= i.getStringExtra("me");
        TextView me2=(TextView) this.findViewById(R.id.me2);
        me2.setText(me);
    }

}