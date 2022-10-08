package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public  class LongText extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.longtext);
        TextView text=(TextView) this.findViewById(R.id.text);
        String paragraph="Lorem ipsum dolor sit amet," +
                " consectetur adipiscing elit, sed do eiusmod tempor " +
                "incididunt ut labore et dolore magna aliqua. Ut enim ad " +
                "minim veniam, quis nostrud exercitation ullamco laboris nisi" +
                " ut aliquip ex ea commodo consequat. Duis aute irure dolor " +
                "in reprehenderit in voluptate velit esse cillum dolore eu fugiat" +
                " nulla pariatur. Excepteur sint occaecat cupidatat non proident, " +
                "sunt in culpa qui officia deserunt mollit anim id est laborum.";
        text.setText(paragraph);
    }
}

