package com.abhishek.cynosure_2k18;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class developers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void call1 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+919960787947"));
        startActivity(intent);
    }

    public void mail1 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="abhishekrudrawar502@gmail.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
    }

    public void call2 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+919594926004"));
        startActivity(intent);
    }

    public void mail2 (View v)
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

