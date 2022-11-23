package com.achievers.jntuhresults;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity implements OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //night mode off detecting in above versions 10
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        Toolbar toolbara = findViewById(R.id.toolbar);
        setSupportActionBar(toolbara);
       // getSupportActionBar().hide();
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbara,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            //one time dialog box for terms and condition, privacy policy
           // SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
            //boolean firstStart = prefs.getBoolean("firstStart", true);
               // showStartDialog();
            Toast.makeText(MainActivity.this, "Loading...", Toast.LENGTH_SHORT).show();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new DashboardFragment()).commit();

            navigationView.setCheckedItem(R.id.nav_dashboard);


        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


        int id = menuItem.getItemId();
        if (id == R.id.nav_dashboard) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new DashboardFragment()).addToBackStack(null).commit();
        } else if (id == R.id.nav_notifications) {
            getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.fragment_container,
                           new NotificationFragment ()).addToBackStack (null).commit ( );


            // Intent intenta=new Intent (MainActivity.this,BarActivity.class);
            // startActivity (intenta);
        } else if (id == R.id.nav_share) {
            // Toast.makeText (this, "Share me", Toast.LENGTH_SHORT).show ( );
            Intent sIntent = new Intent(Intent.ACTION_SEND);
            sIntent.setType("text/plain");
            String body = "Jntuh Results App by college students - the faster way to check Results, know the college updates  Click here to install- https://play.google.com/store/apps/details?id=com.achievers.jntuhresults";
            String sub = "knowledge is power";

            sIntent.putExtra(Intent.EXTRA_SUBJECT, sub);
            sIntent.putExtra(Intent.EXTRA_TEXT, body);
            startActivity(Intent.createChooser(sIntent, "Share using"));
        } else if (id == R.id.nav_feedback) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new FeedbackFragment()).addToBackStack(null).commit();

        } else if (id == R.id.nav_aboutus) {
            Intent abintent = new Intent(MainActivity.this, Aboutus.class);
            startActivity(abintent);
            //   getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.fragment_container,
            //        new Aboutus ()).addToBackStack (null).commit ( );
        }
        else if (id == R.id.nav_search) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new SearchActivity()).addToBackStack(null).commit();

        }
        else if (id == R.id.nav_sgpa) {
            Intent pintent = new Intent(MainActivity.this, SgpaActivity.class);
            startActivity(pintent);
            //   getSupportFragmentManager ( ).beginTransaction ( ).replace (R.id.fragment_container,
            //        new Aboutus ()).addToBackStack (null).commit ( );

        }

        else if (id == R.id.nav_btechresults) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new BtechFragment()).addToBackStack(null).commit();

        }
        else if (id == R.id.nav_resume) {
            Intent rintent = new Intent(MainActivity.this, ResumeBuilder.class);
            startActivity(rintent);

        }
        else if (id == R.id.nav_jntuh) {
            String url = "https://jntuh.ac.in/";
               Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);


        }


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

    private void showStartDialog() {


        final TextView message1 = new TextView(this);
        final SpannableString link1 =
                new SpannableString(this.getText(R.string.link1));

        Linkify.addLinks(link1, Linkify.WEB_URLS);

        message1.setText(link1);
        message1.setMovementMethod(LinkMovementMethod.getInstance());

        new AlertDialog.Builder(this)
                .setTitle("User Data Agreement")
                .setMessage(R.string.pptc)
                .setView(message1)
                .setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create().show();
        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstStart", false);
        editor.apply();
    }
}