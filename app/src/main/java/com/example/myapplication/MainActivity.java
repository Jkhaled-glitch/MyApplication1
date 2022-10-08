package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.provider.CalendarContract;

import java.util.Date;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=(Button) this.findViewById(R.id.btn_showMe);
        Button btn2=(Button) this.findViewById(R.id.btn_longText);
        Button btn3=(Button) this.findViewById(R.id.btn_add);
        EditText me=(EditText) this.findViewById(R.id.me);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text=me.getText().toString();
                if(!text.isEmpty()){
                    Intent i1 =new Intent(MainActivity.this,me.class);
                    i1.putExtra("me",text);
                    startActivity(i1);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,LongText.class ));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Date dt=new Date();
                Intent intent = new Intent(Intent.ACTION_EDIT);
                intent.setType("vnd.android.cursor.item/event");
                intent.putExtra(CalendarContract.Events.TITLE, "Event Title");


                intent.putExtra(CalendarContract.Events.ALL_DAY, false);
                intent.putExtra(CalendarContract.Events.DESCRIPTION, "Event Descripttion");
                intent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Event Location");
                startActivity(Intent.createChooser(intent, "Add to calendar"));

            }
        });
    }
}