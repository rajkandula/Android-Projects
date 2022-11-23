package com.achievers.jntuhresults;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Profile extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    EditText ename,erollno;
    String name,roolno;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ename=(EditText)findViewById(R.id.edittext1);
        erollno=(EditText)findViewById(R.id.edittext2);
        btn=(Button)findViewById(R.id.btn1);
        btn.setOnClickListener(this);
        sharedPreferences=getSharedPreferences("UserPreference", Context.MODE_PRIVATE);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        if(id==R.id.btn1)
        {
            name=ename.getText().toString();
            roolno=erollno.getText().toString();
            SharedPreferences.Editor editor=sharedPreferences.edit();
            editor.putString("name",name);
            editor.putString("rollno",roolno);
            editor.commit();
            Toast.makeText(Profile.this,"Saved sucessfuly",Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}