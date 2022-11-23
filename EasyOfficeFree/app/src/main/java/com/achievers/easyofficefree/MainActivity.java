package com.achievers.easyofficefree;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import android.Manifest;
import android.app.ActionBar;
import android.content.ActivityNotFoundException;
import android.content.ContentUris;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.nbsp.materialfilepicker.MaterialFilePicker;
import com.nbsp.materialfilepicker.ui.FilePickerActivity;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity{
TextView pdf1,doc1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pdf1=(TextView)findViewById(R.id.pdffile);
        doc1=(TextView)findViewById(R.id.doc_word);
       // pdf.setOnClickListener((View.OnClickListener) this);
        pdf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=v.getId();
        if(id==R.id.pdffile) {
            Intent intent=new Intent(MainActivity.this,WordFiles.class);
            startActivity(intent);

            //Toast.makeText(MainActivity.this,"App is Under Development Wait For the Next Updates",Toast.LENGTH_LONG).show();
        }
            }
        });

        doc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=v.getId();
                if(id==R.id.doc_word) {
                    Intent intent=new Intent(MainActivity.this,WordFiles.class);
                    startActivity(intent);

                    //Toast.makeText(MainActivity.this,"App is Under Development Wait For the Next Updates",Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1000);
        }

    }




//    @Override
//    public void onClick(View v) {
//        int id=v.getId();
//        if(id==R.id.pdffile) {
//            Intent intent=new Intent(this,WordFiles.class);
//            startActivity(intent);
//        }
//    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        switch(requestCode) {
            case 1000:{
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this, "Permission Granted!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(this, "Permission Denied!", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        }
    }
}

