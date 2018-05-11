package com.abhishek.cynosure_2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Event extends AppCompatActivity {

    ImageButton b0,b2,b3,b4,b5,b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        b0=findViewById(R.id.imageButton3);
        b2=findViewById(R.id.imageButton4);
        b3=findViewById(R.id.imageButton5);
        b4=findViewById(R.id.imageButton6);
        b5=findViewById(R.id.imageButton7);
        b6=findViewById(R.id.imageButton8);
        b7=findViewById(R.id.imageButton9);
        b8=findViewById(R.id.imageButton10);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy= new Intent(Event.this,comp.class);
                startActivity(toy);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy= new Intent(Event.this,civil.class);
                startActivity(toy);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy= new Intent(Event.this,chemical.class);
                startActivity(toy);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy= new Intent(Event.this,petro.class);
                startActivity(toy);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy= new Intent(Event.this,mech.class);
                startActivity(toy);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy= new Intent(Event.this,electrical.class);
                startActivity(toy);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy= new Intent(Event.this,extc.class);
                startActivity(toy);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy= new Intent(Event.this,community.class);
                startActivity(toy);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
