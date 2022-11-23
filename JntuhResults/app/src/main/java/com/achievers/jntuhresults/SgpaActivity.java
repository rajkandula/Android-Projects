package com.achievers.jntuhresults;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SgpaActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tcredit;
    Button sbtn;
    float sumofcredit=0.0f;
    float tmcg=0.0f;
    float sgpa=0.0f;
    float te1=0.0f,te2=0.0f,te3=0.0f,te4=0.0f,te5=0.0f,te6=0.0f;
    String sum=null, sgpasum=null;
    String tot1,tot2,tot3,tot4,tot5,tot6;
    LinearLayout tlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpa);
       sbtn=(Button)findViewById(R.id.btn_submit);
       sbtn.setOnClickListener(this);

        tcredit=(TextView)findViewById(R.id.totalcredits);
        tcredit.setOnClickListener(this);
        tlayout=(LinearLayout)findViewById(R.id.total_layout);
        tlayout.setVisibility(View.GONE);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.totalcredits) {

            //credits
            EditText c1 = (EditText) findViewById(R.id.credit1);
            EditText c2 = (EditText) findViewById(R.id.credit2);
            EditText c3 = (EditText) findViewById(R.id.credit3);
            EditText c4 = (EditText) findViewById(R.id.credit4);
            EditText c5 = (EditText) findViewById(R.id.credit5);
            EditText c6 = (EditText) findViewById(R.id.credit6);


            //grades
            EditText g1 = (EditText) findViewById(R.id.grade1);
            EditText g2 = (EditText) findViewById(R.id.grade2);
            EditText g3 = (EditText) findViewById(R.id.grade3);
            EditText g4 = (EditText) findViewById(R.id.grade4);
            EditText g5 = (EditText) findViewById(R.id.grade5);
            EditText g6 = (EditText) findViewById(R.id.grade6);

            //credits
            float sc1 = Float.parseFloat(c1.getText().toString());
            float sc2 = Float.parseFloat(c2.getText().toString());
            float sc3 = Float.parseFloat(c3.getText().toString());
            float sc4 = Float.parseFloat(c4.getText().toString());
            float sc5 = Float.parseFloat(c5.getText().toString());
            float sc6 = Float.parseFloat(c6.getText().toString());


            //grades
            float sg1 = Float.parseFloat(g1.getText().toString());
            float sg2 = Float.parseFloat(g2.getText().toString());
            float sg3 = Float.parseFloat(g3.getText().toString());
            float sg4 = Float.parseFloat(g4.getText().toString());
            float sg5 = Float.parseFloat(g5.getText().toString());
            float sg6 = Float.parseFloat(g6.getText().toString());


            //total

            //grades
            EditText t1 = (EditText) findViewById(R.id.cg1);
            te1 = sc1 * sg1;
            tot1 = String.valueOf(te1);
            t1.setText(tot1);

            EditText t2 = (EditText) findViewById(R.id.cg2);
            te2 = sc2 * sg2;
            tot2 = String.valueOf(te2);
            t2.setText(tot2);

            EditText t3 = (EditText) findViewById(R.id.cg3);
            te3 = sc3 * sg3;
            tot3 = String.valueOf(te3);
            t3.setText(tot3);

            EditText t4 = (EditText) findViewById(R.id.cg4);
            te4 = sc4 * sg4;
            tot4 = String.valueOf(te4);
            t4.setText(tot4);

            EditText t5 = (EditText) findViewById(R.id.cg5);
            te5 = sc5 * sg5;
            tot5 = String.valueOf(te5);
            t5.setText(tot5);

            EditText t6 = (EditText) findViewById(R.id.cg6);
            te6 = sc6 * sg6;
            tot6 = String.valueOf(te6);
            t6.setText(tot6);


            //total of total=credit*grade

            tmcg = sc1 * sg1 + sc2 * sg2 + sc3 * sg3 + sc4 * sg4 + sc5 * sg5 + sc6 * sg6;


            //sum of credits

            sumofcredit = sc1 + sc2 + sc3 + sc4 + sc5 + sc6;
            sgpa = tmcg / sumofcredit;
            sum = String.valueOf(sumofcredit);
            sgpasum = String.valueOf(sgpa);
            tlayout.setVisibility(View.VISIBLE);
            tcredit.setText("SGPA is " + sgpasum);
            //  Toast.makeText(getApplicationContext(),"Enter Data",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}