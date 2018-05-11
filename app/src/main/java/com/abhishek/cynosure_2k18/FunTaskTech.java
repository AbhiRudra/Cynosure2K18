package com.abhishek.cynosure_2k18;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class FunTaskTech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_task_tech);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {Intent myMail = new Intent(Intent.ACTION_SEND);

                myMail.setData(Uri.parse("mail to:"));
                myMail.setType("message/rfc822");
                String to="ankushtel@gmail.com";
                String sub="Regarding FUN TASK TECH";
                myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
                myMail.putExtra(Intent.EXTRA_TEXT,"Heyy..");
                startActivity(Intent.createChooser(myMail,"send email"));
            }
        });
    }

    public void callHead1 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+917038228489"));
        startActivity(intent);
    }

    public void callHead2 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+918669809155"));
        startActivity(intent);
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
