package com.achievers.acaministry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.material.navigation.NavigationView;

import java.util.List;




public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    NavigationView nvcheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //night mode off detecting in above versions 10
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);


        Toolbar toolbara = findViewById(R.id.toolbar);
        setSupportActionBar(toolbara);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
          navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbara,
               R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();




        if (savedInstanceState == null) {
            Toast.makeText(MainActivity.this, "Praise The Lord...", Toast.LENGTH_SHORT).show();
           getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                      new Home()).commit();
           // navigationView.getMenu().getItem(0).setChecked(true);
             navigationView.setCheckedItem(R.id.nav_home);
            //onNavigationItemSelected(navigationView.getMenu().findItem(R.id.nav_home));


        }

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id)
        {
            case R.id.nav_home:
                Toast.makeText(MainActivity.this, "Praise The Lord...", Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Home()).addToBackStack(null).commit();

                break;
            case R.id.nav_devotions:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new DailyDevotions()).addToBackStack(null).commit();

                break;
            case R.id.nav_ptime:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new PrayerTimings()).addToBackStack(null).commit();

                break;

            case R.id.nav_preq:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new PrayerRequest()).addToBackStack(null).commit();

                break;

            case R.id.nav_songs:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                      new SongsBook()).addToBackStack(null).commit();
              //  Toast.makeText(getApplicationContext(), "Audio Songs Available soon", Toast.LENGTH_SHORT).show();

                break;

            case R.id.nav_cal:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                       new Calendar()).addToBackStack(null).commit();
                Toast.makeText(getApplicationContext(), "Calendar Events will be Updated Shortly !", Toast.LENGTH_SHORT).show();

                break;
            case R.id.nav_livetv:

//                Intent intentyt=new Intent(MainActivity.this,VideosActivity.class);
//                startActivity(intentyt);

                Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_SHORT).show();
               getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                       new VideosActivity()).addToBackStack(null).commit();

//                String url = "https://www.youtube.com/c/acaministrysulanagar/featured";
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(url));
//                startActivity(i);

                break;

            case R.id.nav_gallery:
               getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Photos()).addToBackStack(null).commit();
              //  Toast.makeText(getApplicationContext(), "Gallery Feature Acailable in Next Update", Toast.LENGTH_SHORT).show();

                break;


            case R.id.nav_contactus:

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                     new ContactUs()).addToBackStack(null).commit();
                //Toast.makeText(getApplicationContext(), "Live Tv Available In Next Update", Toast.LENGTH_SHORT).show();


                break;


            case R.id.nav_aboutus:
                Intent intentjoin=new Intent(MainActivity.this,FollowUs.class);
                startActivity(intentjoin);
                break;


            case R.id.nav_share:
                Intent sIntent = new Intent(Intent.ACTION_SEND);
                sIntent.setType("text/plain");
                String body = " Greetings From ACA MINISTRY\n" +
                        "\n" +
                        "Thank You For Being Here Today.\n" +
                        "\n" +
                        "We welcome your Presence in the Name of Our Lord Jesus Christ.\n" +
                        "\n" +
                        "Hope You Will Enjoy being Part with Us.\n" +
                        "\n" +
                        "May God Bless you Personally, Spiritually, and Your Ministry.\n" +
                        "\n" +
                        "We Pray For Your Spiritual life, hope you will be a part in the Rapture.\n" +
                        "\n" +
                        "We Happy to Pray for You and Your Family.\n" +
                        "\n" +
                        "Please Support us with Your Prayers and Encourage by Sharing Our Social Media Channels, as we are active in all types Of Social Media.\n" +
                        "\n" +
                        "Feel free to contact us for any Queries. We are Happy to assist you.\n" +
                        "\n" +
                        "Mail: acaministrysulanagar@gmail.com\n" +
                        "Contact: 9949205371\n" +
                        "\n" +
                        "INSTALL ACA MINISTRY APP\n" + "Available in PlayStore: https://play.google.com/store/apps/details?id=com.achievers.acaministry";
                String sub = "ACA  MINISTRY COMMUNITY";
                sIntent.putExtra(Intent.EXTRA_SUBJECT, sub);
                sIntent.putExtra(Intent.EXTRA_TEXT, body);
                startActivity(Intent.createChooser(sIntent, "Share using"));
                break;

            default:
                break;
        }




//
//        if (id == R.id.nav_ministry) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
//                    new EmbedVideo()).addToBackStack(null).commit();
//        }
//        else if (id == R.id.nav_joinus) {
//            Intent join = new Intent(MainActivity.this, FollowUs.class);
//            startActivity(join);
//            //   getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.fragment_container,
//            //        new Aboutus ()).addToBackStack (null).commit ( );
//        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onBackPressed() {

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

            super.onBackPressed();
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}