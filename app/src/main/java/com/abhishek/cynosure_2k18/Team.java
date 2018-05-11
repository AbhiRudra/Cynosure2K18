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

public class Team extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void call1 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+919975070077"));
        startActivity(intent);
    }

    public void mail1 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="mulayaditya123@gmail.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
    }


    public void call2 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+919168034069"));
        startActivity(intent);
    }

    public void mail2 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="aditya.padature1@gmail.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
    }

    public void call3 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+919594926004"));
        startActivity(intent);
    }

    public void mail3 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="ankurpathania771@gmail.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
    }

    public void call4 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+918408958988"));
        startActivity(intent);
    }

    public void mail4 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="chinmaysaraf111@gmail.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
    }
    public void call5 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+919921470084"));
        startActivity(intent);
    }

    public void mail5 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="rushikeshjadhao442@gmail.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
    }

    public void call6 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+919970330823"));
        startActivity(intent);
    }

    public void mail6 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="mpawar909@gmail.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
    }

    public void call7 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+919326365496"));
        startActivity(intent);
    }

    public void mail7 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="meghthakur2896@outlook.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
    }

    public void call8 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+917507718536"));
        startActivity(intent);
    }

    public void mail8 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="mrunmayeeture@gmail.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
    }

    public void call9 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+919921954586"));
        startActivity(intent);
    }

    public void mail9 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="randive.shubhangi00@gmail.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
    }

    public void call10 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+918856949910"));
        startActivity(intent);
    }

    public void mail10 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="suraj.nogja29@gmail.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
    }

    public void call11 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+917709494959"));
        startActivity(intent);
    }

    public void mail11 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="tejasganyarpwar28@gmail.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
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
