package com.achievers.jntuhresults;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class Aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_aboutus);

        Element element=new Element ();
        element.setTitle ("Support");

        View aboutPage=new AboutPage (this)
                .isRTL (false)
                .setDescription ("Welcome to the Developers page")
                .addItem (new Element ().setTitle ("Version 18.0"))
                .addItem (new Element ().setTitle (" Privacy Policy")).addWebsite("https://hiachievers.blogspot.com/2020/11/privacy-policy-achievers-built-jntuh.html")
                .addItem (new Element ().setTitle (" Terms & Conditions")).addWebsite("https://hiachievers.blogspot.com/2020/11/terms-conditions-by-downloading-or.html")
                .addGroup ("Connect with us")
                .addYoutube ("UCFebv_fEhxO49LPVSBru6_g")
                .addInstagram ("mgitmeme.s")
                .addItem (new Element ().setTitle ("Visit Developer Store"))
                .addWebsite ("https://play.google.com/store/apps/dev?id=4929819057335032970&hl=en_IN")
                .addItem (CreatorCopyright())
                .setImage (R.drawable.achievers_new)
                .create ();
        setContentView (aboutPage);

    }

    private Element CreatorCopyright() {
        Element copyright=new Element ();
        final String copyrightstring= String.format ("Copyright by Achiever's %d", Calendar.getInstance ().get (Calendar.YEAR));
        copyright.setTitle (copyrightstring);
        copyright.setIcon (R.drawable.achievers_new_mdpi);
        copyright.setGravity (Gravity.CENTER);
        copyright.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {

                Toast.makeText (com.achievers.jntuhresults.Aboutus.this,copyrightstring+"-"+" All rights reserved", Toast.LENGTH_SHORT).show ();

            }

        });
        return copyright;

    }

}
