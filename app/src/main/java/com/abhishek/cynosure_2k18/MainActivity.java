package com.abhishek.cynosure_2k18;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextOutsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    BoomMenuButton bmb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Intent myMail = new Intent(Intent.ACTION_SEND);

                myMail.setData(Uri.parse("mail to:"));
                myMail.setType("message/rfc822");
                String to="cynosure@dbatu.ac.in";
                String sub="Regarding Cynosure-2K18";
                myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
                myMail.putExtra(Intent.EXTRA_TEXT,"Heyy..");
                startActivity(Intent.createChooser(myMail,"send email"));
            }
        });



        bmb=findViewById(R.id.boom);


        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {

            int position = i;

            if (position == 0) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(R.drawable.comp)
                        .normalText("Computer")
                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {
                                Intent toy = new Intent(MainActivity.this, comp.class);
                                startActivity(toy);
                            }
                        });
                bmb.addBuilder(builder);
            }

            else if (position == 1) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(R.drawable.civil)
                        .normalText("Civil")
                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {
                                Intent toy = new Intent(MainActivity.this, civil.class);
                                startActivity(toy);
                            }
                        });
                bmb.addBuilder(builder);
            }

            else if (position == 2) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(R.drawable.tricl)
                        .normalText("Electrical")
                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {
                                Intent toy = new Intent(MainActivity.this, electrical.class);
                                startActivity(toy);
                            }
                        });
                bmb.addBuilder(builder);
            }

            else if (position == 3) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(R.drawable.tronix)
                        .normalText("Electronics")
                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {
                                Intent toy = new Intent(MainActivity.this, extc.class);
                                startActivity(toy);
                            }
                        });
                bmb.addBuilder(builder);
            }

            else if (position == 4) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(R.drawable.chem)
                        .normalText("Chemical")
                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {
                                Intent toy = new Intent(MainActivity.this, chemical.class);
                                startActivity(toy);
                            }
                        });
                bmb.addBuilder(builder);
            }



            else if (position == 5) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(R.drawable.petro)
                        .normalText("Petrochemical")
                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {
                                Intent toy = new Intent(MainActivity.this, petro.class);
                                startActivity(toy);
                            }
                        });
                bmb.addBuilder(builder);
            }

            else if (position == 6) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(R.drawable.mech)
                        .normalText("Mechanical")
                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {
                                Intent toy = new Intent(MainActivity.this, mech.class);
                                startActivity(toy);
                            }
                        });
                bmb.addBuilder(builder);
            }

            else if (position == 7) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(R.drawable.comu)
                        .normalText("Community")
                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {
                                Intent toy = new Intent(MainActivity.this, community.class);
                                startActivity(toy);
                            }
                        });
                bmb.addBuilder(builder);
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_faceboook) {
            String url1= "https://www.facebook.com/dbatu.cynosure/?ref=br_rs";
            Intent toy= new Intent(Intent.ACTION_VIEW, Uri.parse(url1));
            startActivity(toy);
        }else if (id == R.id.action_instagram) {
            String url1= "https://www.instagram.com/cynosure_2k18_/";
            Intent toy= new Intent(Intent.ACTION_VIEW, Uri.parse(url1));
            startActivity(toy);
        }else if (id == R.id.action_youtube) {
            String url1= "https://www.youtube.com/channel/UCN119s5TseSHKmFsU6vxelA";
            Intent toy= new Intent(Intent.ACTION_VIEW, Uri.parse(url1));
            startActivity(toy);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_events) {
            Intent toy= new Intent(MainActivity.this,Event.class);
            startActivity(toy);
        } else if (id == R.id.nav_workshops) {
            Intent toy= new Intent(MainActivity.this,workshops.class);
            startActivity(toy);
        } else if (id == R.id.nav_sponsors) {
            Intent toy= new Intent(MainActivity.this,sponsors.class);
            startActivity(toy);
        } else if (id == R.id.nav_web) {
            String url= "http://www.dbatucynosure.org/";
            Intent toy= new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(toy);
        } else if (id == R.id.nav_share) {
            Intent share=new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            String shareBody="Here it is..! Cynosure-2K18, Technical Festival of Technological University, Dr. Babasaheb Ambedkar Technological University, Lonere: https://play.google.com/store/search?q=Abhishek%20A.%20Rudrawar&hl=en ";
            String shareSub="Official App for Cynosure-2K18";
            share.putExtra(Intent.EXTRA_SUBJECT,shareSub);
            share.putExtra(Intent.EXTRA_TEXT,shareBody);
            startActivity(Intent.createChooser(share,"Share Using"));
            return true;
        } else if (id == R.id.nav_university) {
            Intent toy= new Intent(MainActivity.this,university.class);
            startActivity(toy);
        } else if (id == R.id.nav_developers) {
            Intent toy= new Intent(MainActivity.this,developers.class);
            startActivity(toy);
        } else if (id == R.id.nav_team) {
            Intent toy= new Intent(MainActivity.this,Team.class);
            startActivity(toy);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
