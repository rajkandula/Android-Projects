package com.achievers.acaministry;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class FollowUs extends AppCompatActivity {
    private DrawerLayout drawer;
    NavigationView nvcheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_followus);



        Element element=new Element ();
        element.setTitle ("Support");

        View aboutPage=new AboutPage (this)
                .isRTL (false)
                .setDescription ("Welcome to the ACA-MINISTRY Page")
                .addItem (new Element ().setTitle ("Version 15"))
                .addItem (new Element ().setTitle (" Privacy Policy")).addWebsite("https://acaministry.blogspot.com/2021/01/privacy-policy.html")
                .addItem (new Element ().setTitle (" Terms & Conditions")).addWebsite("https://acaministry.blogspot.com/2021/01/terms-conditions.html")
                .addGroup ("Connect with us")
                .addEmail("acaministrysulanagar@gmail.com")
                .addYoutube ("UCnguWtsjA4v9iICamdhMW0Q")
                .addInstagram ("acaministry")
                .addFacebook("acaministry")
                .addTwitter("acaministry")
                .addItem (new Element ().setTitle ("Visit PINTEREST"))
                .addWebsite ("https://in.pinterest.com/acaministry/")
                .addItem (new Element ().setTitle ("Visit Tumblr"))
                .addWebsite ("https://acaministry.tumblr.com/")
                .addItem (new Element ().setTitle ("Visit ACA Website"))
                .addWebsite ("https://acaministrysulanagar.business.site/")
                .addItem (CreatorCopyright())
                .setImage (R.drawable.ic_icon)
                .create ();
        setContentView (aboutPage);

    }

    private Element CreatorCopyright() {
        Element copyright=new Element ();
        final String copyrightstring= String.format ("Copyright by Achiever's %d", Calendar.getInstance ().get (Calendar.YEAR));
        copyright.setTitle (copyrightstring);
        copyright.setIcon (R.drawable.acaministry_img);
        copyright.setGravity (Gravity.CENTER);
        copyright.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {

                Toast.makeText (com.achievers.acaministry.FollowUs.this,copyrightstring+"-"+" All rights reserved", Toast.LENGTH_SHORT).show ();

            }

        });
        return copyright;

    }

}
